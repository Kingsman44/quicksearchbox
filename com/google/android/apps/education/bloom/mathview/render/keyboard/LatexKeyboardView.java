package com.google.android.apps.education.bloom.mathview.render.keyboard;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C1878d;
import androidx.core.p094f.C1891d;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.tabs.C44918u;
import com.google.android.material.tabs.TabLayout;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.p339ab.p340a.p341a.p342a.C6620a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.chromium.net.PrivateKeyType;
import p5462h.C69613f;
import p5462h.C69685i;
import p5462h.C69747m;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69659i;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class LatexKeyboardView extends ConstraintLayout {

    /* renamed from: e */
    private static final C59071e f31303e = C59071e.m91331h();

    /* renamed from: a */
    public final C69613f f31304a;

    /* renamed from: b */
    public final C9091l f31305b;

    /* renamed from: c */
    public InputConnection f31306c;

    /* renamed from: d */
    public EditorInfo f31307d;

    /* renamed from: f */
    private final C69613f f31308f;

    /* renamed from: g */
    private final C69613f f31309g;

    /* renamed from: h */
    private final C9099t f31310h;

    /* renamed from: i */
    private Typeface f31311i;

    /* renamed from: j */
    private final C9077ad f31312j;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LatexKeyboardView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (C69659i) null);
        C69664n.m101061g(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LatexKeyboardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (C69659i) null);
        C69664n.m101061g(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LatexKeyboardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C69664n.m101061g(context, "context");
        this.f31308f = new C69747m(new C9105z(this));
        this.f31309g = new C69747m(new C9102w(this));
        this.f31304a = new C69747m(new C9098s(this));
        C9099t tVar = new C9099t();
        this.f31310h = tVar;
        this.f31305b = new C9091l(tVar, new C9103x(this), new C9104y(this));
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(R.id.add_row, C6620a.ADD_ROW);
        sparseArray.put(R.id.left_parenthesis, C6620a.LEFT_PARENTHESIS);
        sparseArray.put(R.id.right_parenthesis, C6620a.RIGHT_PARENTHESIS);
        sparseArray.put(R.id.fraction, C6620a.FRACTION);
        sparseArray.put(R.id.fraction_with_base, C6620a.FRACTION_WITH_BASE);
        sparseArray.put(R.id.exponent, C6620a.EXPONENT);
        sparseArray.put(R.id.exponent_three, C6620a.EXPONENT_THREE);
        sparseArray.put(R.id.exponent_custom, C6620a.EXPONENT_CUSTOM);
        sparseArray.put(R.id.greek, C6620a.VARIABLE);
        sparseArray.put(R.id.variable, C6620a.VARIABLE);
        sparseArray.put(R.id.root, C6620a.ROOT);
        sparseArray.put(R.id.root_cubed, C6620a.ROOT_CUBED);
        sparseArray.put(R.id.root_custom, C6620a.ROOT_CUSTOM);
        sparseArray.put(R.id.function, C6620a.FUNCTION);
        sparseArray.put(R.id.function_g, C6620a.FUNCTION_G);
        sparseArray.put(R.id.function_custom, C6620a.FUNCTION_CUSTOM);
        sparseArray.put(R.id.pi, C6620a.PI);
        sparseArray.put(R.id.pi_over_two, C6620a.PI_OVER_THREE);
        sparseArray.put(R.id.pi_over_three, C6620a.PI_OVER_TWO);
        sparseArray.put(R.id.zero, C6620a.DIGIT);
        sparseArray.put(R.id.one, C6620a.DIGIT);
        sparseArray.put(R.id.two, C6620a.DIGIT);
        sparseArray.put(R.id.three, C6620a.DIGIT);
        sparseArray.put(R.id.four, C6620a.DIGIT);
        sparseArray.put(R.id.five, C6620a.DIGIT);
        sparseArray.put(R.id.six, C6620a.DIGIT);
        sparseArray.put(R.id.seven, C6620a.DIGIT);
        sparseArray.put(R.id.eight, C6620a.DIGIT);
        sparseArray.put(R.id.nine, C6620a.DIGIT);
        sparseArray.put(R.id.period, C6620a.PERIOD);
        sparseArray.put(R.id.equals, C6620a.EQUALS);
        sparseArray.put(R.id.plus, C6620a.PLUS);
        sparseArray.put(R.id.subtract, C6620a.SUBTRACT);
        sparseArray.put(R.id.divide, C6620a.DIVIDE);
        sparseArray.put(R.id.multiply, C6620a.MULTIPLY);
        sparseArray.put(R.id.less, C6620a.LESS);
        sparseArray.put(R.id.less_eq, C6620a.LESS_EQUAL);
        sparseArray.put(R.id.greater, C6620a.GREATER);
        sparseArray.put(R.id.greater_eq, C6620a.GREATER_EQUAL);
        sparseArray.put(R.id.log, C6620a.LOG);
        sparseArray.put(R.id.log_custom, C6620a.LOG_CUSTOM);
        sparseArray.put(R.id.natural_log, C6620a.NT_LOG);
        sparseArray.put(R.id.e, C6620a.E);
        sparseArray.put(R.id.exp, C6620a.EXP);
        sparseArray.put(R.id.abs, C6620a.ABS);
        sparseArray.put(R.id.abs_single, C6620a.ABS_SINGLE);
        sparseArray.put(R.id.bin_base, C6620a.BIN_BASE);
        sparseArray.put(R.id.tri_base, C6620a.TRI_BASE);
        sparseArray.put(R.id.custom_base, C6620a.CUSTOM_BASE);
        sparseArray.put(R.id.degree_base, C6620a.DEGREE_BASE);
        sparseArray.put(R.id.sin, C6620a.SIN);
        sparseArray.put(R.id.csc, C6620a.CSC);
        sparseArray.put(R.id.arcsin, C6620a.ARCSIN);
        sparseArray.put(R.id.sinh, C6620a.SINH);
        sparseArray.put(R.id.cos, C6620a.COS);
        sparseArray.put(R.id.sec, C6620a.SEC);
        sparseArray.put(R.id.arccos, C6620a.ARCCOS);
        sparseArray.put(R.id.cosh, C6620a.COSH);
        sparseArray.put(R.id.tan, C6620a.TAN);
        sparseArray.put(R.id.cot, C6620a.COT);
        sparseArray.put(R.id.tanh, C6620a.TANH);
        sparseArray.put(R.id.arctan, C6620a.ARCTAN);
        sparseArray.put(R.id.integral, C6620a.INTEGRAL);
        sparseArray.put(R.id.integral_custom, C6620a.INTEGRAL_CUSTOM);
        sparseArray.put(R.id.derivative, C6620a.DERIVATIVE);
        sparseArray.put(R.id.derivative_var, C6620a.DERIVATIVE_VAR);
        sparseArray.put(R.id.limit, C6620a.LIMIT);
        sparseArray.put(R.id.limit_plus, C6620a.LIMIT_PLUS);
        sparseArray.put(R.id.limit_minus, C6620a.LIMIT_MINUS);
        sparseArray.put(R.id.theta, C6620a.THETA);
        sparseArray.put(R.id.factorial, C6620a.FACTORIAL);
        sparseArray.put(R.id.percentage, C6620a.PERCENTAGE);
        sparseArray.put(R.id.imaginary, C6620a.IMAGINARY);
        sparseArray.put(R.id.inf, C6620a.INF);
        sparseArray.put(R.id.sum, C6620a.SUM);
        sparseArray.put(R.id.comma, C6620a.COMMA);
        sparseArray.put(R.id.prime, C6620a.PRIME);
        new LinkedHashMap();
        this.f31312j = new C9077ad((byte[]) null);
        setBackgroundColor(C1878d.m5128a(context, R.color.keyboard_background));
        View.inflate(context, R.layout.view_latex_keyboard, this);
    }

    /* renamed from: a */
    public final ViewPager2 mo17384a() {
        return (ViewPager2) this.f31308f.mo5768a();
    }

    /* renamed from: b */
    public final void mo17385b(View view) {
        InputConnection inputConnection = this.f31306c;
        if (inputConnection == null) {
            C59052c cVar = (C59052c) f31303e.mo56226d();
            cVar.mo56379ah(new C59094n(10));
            cVar.mo56386p("Click ignored, no input connection provided");
            return;
        }
        C9085f fVar = C9085f.f31334a;
        C69664n.m101061g(view, "view");
        ArrayList arrayList = (ArrayList) C9085f.f31336c.get(view.getId());
        if (arrayList == null) {
            arrayList = (ArrayList) C9085f.f31335b.get(view.getId());
        }
        if (arrayList != null) {
            inputConnection.performPrivateCommand("com.google.android.apps.education.bloom.mathview.render.comm.COMMAND_ACTION", C1891d.m5154a(new C69685i("commands", arrayList)));
            view.getId();
            return;
        }
        int id = view.getId();
        int i = 2;
        if (id == R.id.move_left) {
            inputConnection.sendKeyEvent(KeyEvent.changeFlags(new KeyEvent(0, 21), 2));
        } else if (id == R.id.move_right) {
            inputConnection.sendKeyEvent(KeyEvent.changeFlags(new KeyEvent(0, 22), 2));
        } else if (id == R.id.backspace) {
            inputConnection.sendKeyEvent(KeyEvent.changeFlags(new KeyEvent(0, 67), 2));
        } else if (id == R.id.ime_action) {
            EditorInfo editorInfo = this.f31307d;
            if (editorInfo != null) {
                i = editorInfo.imeOptions;
            }
            Integer valueOf = Integer.valueOf(i & PrivateKeyType.INVALID);
            if (valueOf.intValue() == 1) {
                valueOf = null;
            }
            if (valueOf != null) {
                inputConnection.performEditorAction(valueOf.intValue());
            }
        } else {
            C59052c cVar2 = (C59052c) f31303e.mo56226d();
            String resourceEntryName = view.getId() > 0 ? getResources().getResourceEntryName(view.getId()) : "NO_ID";
            cVar2.mo56379ah(new C59094n(9));
            cVar2.mo56389s("Unrecognized click on view with ID=R.id.%s", resourceEntryName);
        }
    }

    /* renamed from: c */
    public final void mo17386c(Typeface typeface) {
        if (!C69664n.m101066l(this.f31311i, typeface)) {
            C9091l lVar = this.f31305b;
            if (!C69664n.m101066l(lVar.f31349a, typeface)) {
                lVar.f31349a = typeface;
                lVar.mObservable.mo2881c(0, 2, (Object) null);
            }
            this.f31311i = typeface;
            invalidate();
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C9088i iVar = C9088i.f31339a;
        C9088i.f31341c.clear();
        C9088i.f31342d.clear();
        C9085f fVar = C9085f.f31334a;
        C9085f.f31336c.clear();
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        mo17384a().mo9210b(this.f31305b);
        mo17384a().mo9216e(2);
        new C44918u((TabLayout) this.f31309g.mo5768a(), mo17384a(), new C9100u(this, getResources().getDimensionPixelSize(R.dimen.keyboard_indicator_tab_width))).mo48453a();
        Integer valueOf = Integer.valueOf(R.id.move_left);
        Integer valueOf2 = Integer.valueOf(R.id.move_right);
        Integer valueOf3 = Integer.valueOf(R.id.backspace);
        for (Number intValue : C69540x.m100947e(valueOf, valueOf2, Integer.valueOf(R.id.add_row), valueOf3, Integer.valueOf(R.id.ime_action))) {
            findViewById(intValue.intValue()).setOnClickListener(new C9101v(this));
        }
        for (Number intValue2 : C69540x.m100947e(valueOf, valueOf2, valueOf3)) {
            findViewById(intValue2.intValue()).setOnTouchListener(this.f31312j);
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C69664n.m101061g(motionEvent, "event");
        if (motionEvent.getActionMasked() == 5) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LatexKeyboardView(Context context, AttributeSet attributeSet, int i, int i2, C69659i iVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
