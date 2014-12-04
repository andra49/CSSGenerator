// Generated from CSS.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CSSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__8=1, T__7=2, T__6=3, T__5=4, T__4=5, T__3=6, T__2=7, T__1=8, T__0=9, 
		INT=10, STRING=11, WS=12;
	public static final String[] tokenNames = {
		"<INVALID>", "'css'", "'lang'", "'col'", "'title'", "'['", "'{'", "'-'", 
		"']'", "'}'", "INT", "STRING", "WS"
	};
	public static final int
		RULE_prog = 0, RULE_root = 1, RULE_title = 2, RULE_title_string = 3, RULE_lang = 4, 
		RULE_lang_string = 5, RULE_col = 6, RULE_row = 7, RULE_row_items = 8, 
		RULE_row_item = 9, RULE_special = 10, RULE_integer = 11;
	public static final String[] ruleNames = {
		"prog", "root", "title", "title_string", "lang", "lang_string", "col", 
		"row", "row_items", "row_item", "special", "integer"
	};

	@Override
	public String getGrammarFileName() { return "CSS.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CSSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<RootContext> root() {
			return getRuleContexts(RootContext.class);
		}
		public RootContext root(int i) {
			return getRuleContext(RootContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSListener ) ((CSSListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSListener ) ((CSSListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24); match(T__8);
			setState(25); match(T__3);
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26); root();
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__6) | (1L << T__5))) != 0) );
			setState(31); match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RootContext extends ParserRuleContext {
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public LangContext lang() {
			return getRuleContext(LangContext.class,0);
		}
		public ColContext col() {
			return getRuleContext(ColContext.class,0);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSListener ) ((CSSListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSListener ) ((CSSListener)listener).exitRoot(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_root);
		try {
			setState(36);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(33); col();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(34); title();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(35); lang();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TitleContext extends ParserRuleContext {
		public Title_stringContext title_string() {
			return getRuleContext(Title_stringContext.class,0);
		}
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSListener ) ((CSSListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSListener ) ((CSSListener)listener).exitTitle(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); match(T__5);
			setState(39); match(T__4);
			setState(40); title_string();
			setState(41); match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Title_stringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(CSSParser.STRING, 0); }
		public Title_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSListener ) ((CSSListener)listener).enterTitle_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSListener ) ((CSSListener)listener).exitTitle_string(this);
		}
	}

	public final Title_stringContext title_string() throws RecognitionException {
		Title_stringContext _localctx = new Title_stringContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_title_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LangContext extends ParserRuleContext {
		public Lang_stringContext lang_string() {
			return getRuleContext(Lang_stringContext.class,0);
		}
		public LangContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lang; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSListener ) ((CSSListener)listener).enterLang(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSListener ) ((CSSListener)listener).exitLang(this);
		}
	}

	public final LangContext lang() throws RecognitionException {
		LangContext _localctx = new LangContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_lang);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); match(T__7);
			setState(46); match(T__4);
			setState(47); lang_string();
			setState(48); match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lang_stringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(CSSParser.STRING, 0); }
		public Lang_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lang_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSListener ) ((CSSListener)listener).enterLang_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSListener ) ((CSSListener)listener).exitLang_string(this);
		}
	}

	public final Lang_stringContext lang_string() throws RecognitionException {
		Lang_stringContext _localctx = new Lang_stringContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lang_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColContext extends ParserRuleContext {
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public ColContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_col; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSListener ) ((CSSListener)listener).enterCol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSListener ) ((CSSListener)listener).exitCol(this);
		}
	}

	public final ColContext col() throws RecognitionException {
		ColContext _localctx = new ColContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_col);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); match(T__6);
			setState(53); match(T__3);
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54); row();
				}
				}
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 );
			setState(59); match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowContext extends ParserRuleContext {
		public Row_itemsContext row_items() {
			return getRuleContext(Row_itemsContext.class,0);
		}
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSListener ) ((CSSListener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSListener ) ((CSSListener)listener).exitRow(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_row);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); match(T__4);
			setState(62); row_items();
			setState(63); match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Row_itemsContext extends ParserRuleContext {
		public Row_itemContext row_item() {
			return getRuleContext(Row_itemContext.class,0);
		}
		public Row_itemsContext row_items() {
			return getRuleContext(Row_itemsContext.class,0);
		}
		public Row_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row_items; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSListener ) ((CSSListener)listener).enterRow_items(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSListener ) ((CSSListener)listener).exitRow_items(this);
		}
	}

	public final Row_itemsContext row_items() throws RecognitionException {
		Row_itemsContext _localctx = new Row_itemsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_row_items);
		try {
			setState(70);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65); row_item();
				setState(66); match(T__2);
				setState(67); row_items();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69); row_item();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Row_itemContext extends ParserRuleContext {
		public RowContext row() {
			return getRuleContext(RowContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public SpecialContext special() {
			return getRuleContext(SpecialContext.class,0);
		}
		public Row_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSListener ) ((CSSListener)listener).enterRow_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSListener ) ((CSSListener)listener).exitRow_item(this);
		}
	}

	public final Row_itemContext row_item() throws RecognitionException {
		Row_itemContext _localctx = new Row_itemContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_row_item);
		try {
			setState(76);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72); integer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73); special();
				setState(74); row();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecialContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CSSParser.INT, 0); }
		public SpecialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSListener ) ((CSSListener)listener).enterSpecial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSListener ) ((CSSListener)listener).exitSpecial(this);
		}
	}

	public final SpecialContext special() throws RecognitionException {
		SpecialContext _localctx = new SpecialContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_special);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CSSParser.INT, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSListener ) ((CSSListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSListener ) ((CSSListener)listener).exitInteger(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\16U\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\3\2\6\2\36\n\2\r\2\16\2\37\3\2\3\2\3\3\3\3\3\3"+
		"\5\3\'\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\b\6\b:\n\b\r\b\16\b;\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\5\nI\n\n\3\13\3\13\3\13\3\13\5\13O\n\13\3\f\3\f\3\r\3\r\3\r\2\2\16"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\2\2N\2\32\3\2\2\2\4&\3\2\2\2\6(\3\2\2\2"+
		"\b-\3\2\2\2\n/\3\2\2\2\f\64\3\2\2\2\16\66\3\2\2\2\20?\3\2\2\2\22H\3\2"+
		"\2\2\24N\3\2\2\2\26P\3\2\2\2\30R\3\2\2\2\32\33\7\3\2\2\33\35\7\b\2\2\34"+
		"\36\5\4\3\2\35\34\3\2\2\2\36\37\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 !\3"+
		"\2\2\2!\"\7\13\2\2\"\3\3\2\2\2#\'\5\16\b\2$\'\5\6\4\2%\'\5\n\6\2&#\3\2"+
		"\2\2&$\3\2\2\2&%\3\2\2\2\'\5\3\2\2\2()\7\6\2\2)*\7\7\2\2*+\5\b\5\2+,\7"+
		"\n\2\2,\7\3\2\2\2-.\7\r\2\2.\t\3\2\2\2/\60\7\4\2\2\60\61\7\7\2\2\61\62"+
		"\5\f\7\2\62\63\7\n\2\2\63\13\3\2\2\2\64\65\7\r\2\2\65\r\3\2\2\2\66\67"+
		"\7\5\2\2\679\7\b\2\28:\5\20\t\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2"+
		"\2<=\3\2\2\2=>\7\13\2\2>\17\3\2\2\2?@\7\7\2\2@A\5\22\n\2AB\7\n\2\2B\21"+
		"\3\2\2\2CD\5\24\13\2DE\7\t\2\2EF\5\22\n\2FI\3\2\2\2GI\5\24\13\2HC\3\2"+
		"\2\2HG\3\2\2\2I\23\3\2\2\2JO\5\30\r\2KL\5\26\f\2LM\5\20\t\2MO\3\2\2\2"+
		"NJ\3\2\2\2NK\3\2\2\2O\25\3\2\2\2PQ\7\f\2\2Q\27\3\2\2\2RS\7\f\2\2S\31\3"+
		"\2\2\2\7\37&;HN";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}