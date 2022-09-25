package com.google.android.apps.education.bloom.mathview.render;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.AppCompatImageView;
import android.support.p033v7.widget.C0508af;
import android.text.Editable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.core.content.C1877c;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.education.bloom.mathview.render.comm.C9058b;
import com.google.android.apps.education.bloom.mathview.render.keyboard.ImeButton;
import com.google.android.apps.education.bloom.mathview.render.keyboard.LatexKeyboardView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.p3545q.p3546a.C45206d;
import com.google.apps.p3589d.p3590a.C45681a;
import com.google.apps.p3589d.p3590a.C45685b;
import com.google.apps.p3589d.p3590a.C45687d;
import com.google.apps.p3589d.p3590a.C45698o;
import com.google.apps.p3589d.p3590a.C45699p;
import com.google.apps.p3589d.p3590a.C45705v;
import com.google.apps.p3589d.p3590a.C45706w;
import com.google.apps.p3589d.p3590a.C45707x;
import com.google.apps.p3589d.p3593d.C45749h;
import com.google.apps.p3589d.p3594e.C45784n;
import com.google.apps.p3589d.p3594e.C45791u;
import com.google.apps.p3589d.p3594e.C45795y;
import com.google.apps.p3589d.p3595f.C45819v;
import com.google.apps.p3589d.p3596g.C45834b;
import com.google.apps.p3589d.p3596g.C45848p;
import com.google.apps.p3589d.p3600k.C45937b;
import com.google.apps.p3589d.p3600k.C45941f;
import com.google.apps.p3589d.p3600k.C45944i;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.chromium.net.PrivateKeyType;
import p5462h.C69613f;
import p5462h.C69747m;
import p5462h.C69788q;
import p5462h.p5463a.C69531o;
import p5462h.p5473f.p5475b.C69659i;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* compiled from: PG */
public final class LatexEditText extends C0508af {

    /* renamed from: c */
    private static final C59071e f31268c = C59071e.m91331h();

    /* renamed from: a */
    public boolean f31269a;

    /* renamed from: b */
    public LatexKeyboardView f31270b;

    /* renamed from: d */
    private final ScheduledExecutorService f31271d;

    /* renamed from: e */
    private final Runnable f31272e;

    /* renamed from: f */
    private ScheduledFuture f31273f;

    /* renamed from: g */
    private Drawable f31274g;

    /* renamed from: h */
    private final C9071j f31275h;

    /* renamed from: i */
    private final C69613f f31276i;

    /* renamed from: j */
    private final Paint f31277j;

    /* renamed from: k */
    private Typeface f31278k;

    /* renamed from: l */
    private final GestureDetector f31279l;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LatexEditText(Context context) {
        this(context, (AttributeSet) null, 0, 6, (C69659i) null);
        C69664n.m101061g(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LatexEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (C69659i) null);
        C69664n.m101061g(context, "context");
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LatexEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C69664n.m101061g(context, "context");
        this.f31269a = true;
        this.f31271d = Executors.newSingleThreadScheduledExecutor();
        this.f31272e = new C9106l(this);
        this.f31275h = new C9071j();
        this.f31276i = new C69747m(C9110p.f31379a);
        Paint paint = new Paint();
        paint.setStrokeWidth(TypedValue.applyDimension(1, 1.0f, context.getResources().getDisplayMetrics()));
        paint.setStyle(Paint.Style.STROKE);
        this.f31277j = paint;
        this.f31279l = new GestureDetector(context, new C9072k());
        Paint paint2 = new Paint();
        paint2.setColor(Color.argb(PrivateKeyType.INVALID, 185, 185, 185));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(paint2.getTextSize() / 4.0f);
        paint2.setPathEffect(new DashPathEffect(new float[]{paint2.getTextSize() / 6.0f, paint2.getTextSize() / 6.0f}, 0.0f));
        setCursorVisible(false);
        setOnClickListener(new C9054a(this));
        setRawInputType(1);
        setTextIsSelectable(true);
        setHorizontalFadingEdgeEnabled(true);
        setFadingEdgeLength((int) context.getResources().getDimension(R.dimen.fade_length));
        setShowSoftInputOnFocus(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.colorControlNormal});
        C69664n.m101060f(obtainStyledAttributes, "context.obtainStyledAttr…attr.colorControlNormal))");
        paint.setColor(obtainStyledAttributes.getColor(0, paint.getColor()));
        obtainStyledAttributes.recycle();
        setMovementMethod(new C9112r());
        TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16843618}, 0, 0);
        try {
            int resourceId = obtainStyledAttributes2.getResourceId(0, 0);
            if (resourceId != 0) {
                this.f31274g = C1877c.m5125a(context, resourceId);
            }
            obtainStyledAttributes2.recycle();
            setLongClickable(false);
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    /* renamed from: f */
    private final Rect m23590f() {
        return (Rect) this.f31276i.mo5768a();
    }

    /* renamed from: g */
    private final void m23591g(Canvas canvas, C9111q qVar, C9068g gVar) {
        C69788q qVar2;
        if (gVar.f31295c >= 0) {
            C9065d dVar = (C9065d) this.f31275h.get(gVar);
            if (dVar == null) {
                dVar = (C9065d) C9065d.f31289a.mo5126a();
                if (qVar != null) {
                    int selectionStart = getSelectionStart();
                    Editable text = getText();
                    C69664n.m101058d(text);
                    C45699p a = qVar.mo17420a(selectionStart - text.getSpanStart(qVar));
                    Path path = dVar.f31290b;
                    path.reset();
                    C45681a aVar = (C45681a) a;
                    C45944i iVar = aVar.f120165a;
                    path.moveTo((float) iVar.mo50042a(), (float) iVar.mo50043b());
                    C45944i iVar2 = aVar.f120165a;
                    path.lineTo((float) iVar2.mo50042a(), ((float) iVar2.mo50043b()) - ((float) aVar.f120166b));
                } else {
                    getLayout().getCursorPath(gVar.f31295c, dVar.f31290b, getText());
                }
                dVar.f31290b.computeBounds(dVar.f31291c, true);
                C9071j jVar = this.f31275h;
                C9068g gVar2 = (C9068g) C9068g.f31293a.mo5126a();
                gVar2.f31294b = gVar.f31294b;
                gVar2.f31295c = gVar.f31295c;
                gVar2.f31296d = gVar.f31296d;
                jVar.put(gVar2, dVar);
            }
            C69664n.m101060f(dVar, "cursorPath");
            int save = canvas.save();
            try {
                Drawable drawable = this.f31274g;
                if (drawable != null) {
                    int i = (int) dVar.f31291c.top;
                    int i2 = (int) dVar.f31291c.bottom;
                    float f = dVar.f31291c.left;
                    drawable.getPadding(m23590f());
                    int intrinsicWidth = drawable.getIntrinsicWidth();
                    if (f < 0.5f) {
                        f = 0.5f;
                    }
                    int i3 = (int) (f - ((float) m23590f().left));
                    drawable.setBounds(getPaddingLeft() + i3, (i - m23590f().top) + getPaddingTop(), i3 + intrinsicWidth + getPaddingLeft(), i2 + m23590f().bottom + getPaddingTop());
                    drawable.draw(canvas);
                    qVar2 = C69788q.f186170a;
                } else {
                    qVar2 = null;
                }
                if (qVar2 == null) {
                    C59052c cVar = (C59052c) f31268c.mo56224b();
                    cVar.mo56379ah(new C59094n(2));
                    cVar.mo56386p("drawing cursor from path");
                    canvas.drawPath(dVar.f31290b, this.f31277j);
                }
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }

    /* renamed from: b */
    public final C9111q mo17329b(String str) {
        C45706w f = C45707x.m81446f();
        f.mo49755b(true);
        ((C45687d) f).f120175b = C45941f.m82028e(Color.red(getCurrentTextColor()), Color.green(getCurrentTextColor()), Color.blue(getCurrentTextColor()), Color.alpha(getCurrentTextColor()));
        C45707x a = f.mo49754a();
        C69664n.m101060f(a, "builder()\n        .setSh…       )\n        .build()");
        C45791u uVar = new C45791u(C45819v.m81731j(1), a);
        try {
            C45749h a2 = C45848p.m81812a(str, new C45834b(uVar.f120413i.mo49759d()));
            boolean z = false;
            if (uVar.f120395a <= 0) {
                if (uVar.f120407c == C45749h.f120309a) {
                    z = true;
                }
            }
            uVar.mo49800a(new C45784n(uVar, a2));
            uVar.mo49803d(11);
            if (z) {
                uVar.mo49909k();
            }
            C45206d dVar = new C45206d(getTextSize());
            dVar.mo49044i(uVar);
            dVar.mo49047l(this.f31278k);
            return new C9111q(dVar, uVar);
        } catch (Throwable unused) {
            C59052c cVar = (C59052c) f31268c.mo56226d();
            cVar.mo56379ah(new C59094n(1));
            cVar.mo56389s("LaTeX parse failed for '%s'", str);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0159, code lost:
        if ((r1 - r10) < r11) goto L_0x0124;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0169 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x016b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean bringPointIntoView(int r19) {
        /*
            r18 = this;
            r0 = r19
            boolean r1 = r18.isLayoutRequested()
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            android.text.Layout r1 = r18.getLayout()
            int r1 = r1.getLineForOffset(r0)
            android.text.Layout r3 = r18.getLayout()
            android.text.Layout$Alignment r3 = r3.getParagraphAlignment(r1)
            r4 = 2
            r5 = 1
            if (r3 != 0) goto L_0x0020
        L_0x001e:
            r3 = 0
            goto L_0x003f
        L_0x0020:
            int[] r6 = com.google.android.apps.education.bloom.mathview.render.C9070i.f31298a
            int r3 = r3.ordinal()
            r3 = r6[r3]
            if (r3 == r5) goto L_0x0037
            if (r3 == r4) goto L_0x002d
            goto L_0x001e
        L_0x002d:
            android.text.Layout r3 = r18.getLayout()
            int r3 = r3.getParagraphDirection(r1)
            int r3 = -r3
            goto L_0x003f
        L_0x0037:
            android.text.Layout r3 = r18.getLayout()
            int r3 = r3.getParagraphDirection(r1)
        L_0x003f:
            android.text.Editable r6 = r18.getText()
            if (r6 == 0) goto L_0x0092
            java.lang.Class<com.google.android.apps.education.bloom.mathview.render.q> r7 = com.google.android.apps.education.bloom.mathview.render.C9111q.class
            java.lang.Object[] r6 = r6.getSpans(r0, r0, r7)
            com.google.android.apps.education.bloom.mathview.render.q[] r6 = (com.google.android.apps.education.bloom.mathview.render.C9111q[]) r6
            r7 = 0
            if (r6 == 0) goto L_0x007a
            java.lang.Object r6 = p5462h.p5463a.C69531o.m100934k(r6)
            com.google.android.apps.education.bloom.mathview.render.q r6 = (com.google.android.apps.education.bloom.mathview.render.C9111q) r6
            if (r6 == 0) goto L_0x007a
            com.google.apps.d.a.p r0 = r6.mo17420a(r0)
            com.google.apps.d.a.a r0 = (com.google.apps.p3589d.p3590a.C45681a) r0
            com.google.apps.d.k.i r6 = r0.f120165a
            double r7 = r6.mo50042a()
            int r7 = (int) r7
            double r8 = r6.mo50043b()
            int r8 = (int) r8
            double r9 = r6.mo50043b()
            double r11 = r0.f120166b
            double r9 = r9 - r11
            int r0 = (int) r9
            h.q r6 = p5462h.C69788q.f186170a
            r17 = r7
            r7 = r6
            r6 = r17
            goto L_0x007d
        L_0x007a:
            r0 = 0
            r6 = 0
            r8 = 0
        L_0x007d:
            if (r7 != 0) goto L_0x0095
            android.text.Layout r0 = r18.getLayout()
            int r0 = r0.getLineTop(r1)
            android.text.Layout r7 = r18.getLayout()
            int r8 = r1 + 1
            int r8 = r7.getLineTop(r8)
            goto L_0x0095
        L_0x0092:
            r0 = 0
            r6 = 0
            r8 = 0
        L_0x0095:
            android.text.Layout r7 = r18.getLayout()
            int r7 = r7.getLineTop(r1)
            android.text.Layout r9 = r18.getLayout()
            int r10 = r1 + 1
            int r9 = r9.getLineTop(r10)
            android.text.Layout r10 = r18.getLayout()
            float r10 = r10.getLineLeft(r1)
            int r10 = (int) r10
            android.text.Layout r11 = r18.getLayout()
            float r1 = r11.getLineRight(r1)
            int r1 = (int) r1
            int r11 = r18.getWidth()
            int r12 = r18.getCompoundPaddingLeft()
            int r11 = r11 - r12
            int r12 = r18.getCompoundPaddingRight()
            int r11 = r11 - r12
            int r12 = r18.getHeight()
            int r13 = r18.getExtendedPaddingTop()
            int r12 = r12 - r13
            int r13 = r18.getExtendedPaddingBottom()
            int r12 = r12 - r13
            int r13 = r8 - r0
            int r13 = r13 / r4
            int r14 = r12 / 4
            if (r13 > r14) goto L_0x00dd
            r14 = r13
        L_0x00dd:
            int r15 = r11 / 4
            if (r13 <= r15) goto L_0x00e2
            r13 = r15
        L_0x00e2:
            int r15 = r18.getScrollX()
            int r16 = r18.getScrollY()
            int r2 = r0 - r16
            if (r2 >= r14) goto L_0x00f0
            int r16 = r0 - r14
        L_0x00f0:
            int r0 = r12 - r14
            int r2 = r8 - r16
            if (r2 <= r0) goto L_0x00f8
            int r16 = r8 - r0
        L_0x00f8:
            int r0 = r9 - r16
            if (r0 >= r12) goto L_0x00fe
            int r16 = r9 - r12
        L_0x00fe:
            int r0 = r7 - r16
            if (r0 <= 0) goto L_0x0103
            goto L_0x0105
        L_0x0103:
            r7 = r16
        L_0x0105:
            int r0 = r6 - r15
            if (r0 >= r13) goto L_0x010b
            int r15 = r6 - r13
        L_0x010b:
            int r0 = r11 - r13
            int r2 = r6 - r15
            if (r2 <= r0) goto L_0x0113
            int r15 = r6 - r0
        L_0x0113:
            r2 = -1
            if (r3 == r2) goto L_0x0151
            if (r3 == r5) goto L_0x0144
            int r2 = r1 - r10
            if (r2 > r11) goto L_0x0120
            int r11 = r11 - r2
            int r11 = r11 / r4
            int r10 = r10 - r11
            goto L_0x015c
        L_0x0120:
            int r2 = r1 - r13
            if (r6 <= r2) goto L_0x0127
        L_0x0124:
            int r10 = r1 - r11
            goto L_0x015c
        L_0x0127:
            int r2 = r10 + r13
            if (r6 >= r2) goto L_0x012c
            goto L_0x015c
        L_0x012c:
            if (r10 <= r15) goto L_0x012f
            goto L_0x015c
        L_0x012f:
            int r2 = r15 + r11
            if (r1 >= r2) goto L_0x0134
            goto L_0x0124
        L_0x0134:
            int r1 = r6 - r15
            if (r1 >= r13) goto L_0x013c
            int r1 = r6 - r13
            r10 = r1
            goto L_0x013d
        L_0x013c:
            r10 = r15
        L_0x013d:
            int r1 = r6 - r10
            if (r1 <= r0) goto L_0x015c
            int r10 = r6 - r0
            goto L_0x015c
        L_0x0144:
            int r0 = r1 - r15
            if (r0 >= r11) goto L_0x014a
            int r15 = r1 - r11
        L_0x014a:
            int r0 = r10 - r15
            if (r0 <= 0) goto L_0x014f
            goto L_0x015c
        L_0x014f:
            r10 = r15
            goto L_0x015c
        L_0x0151:
            int r0 = r10 - r15
            if (r0 <= 0) goto L_0x0156
            goto L_0x0157
        L_0x0156:
            r10 = r15
        L_0x0157:
            int r0 = r1 - r10
            if (r0 >= r11) goto L_0x015c
            goto L_0x0124
        L_0x015c:
            int r0 = r18.getScrollX()
            if (r10 != r0) goto L_0x016b
            int r0 = r18.getScrollY()
            if (r7 == r0) goto L_0x0169
            goto L_0x016b
        L_0x0169:
            r0 = 0
            return r0
        L_0x016b:
            r0 = r18
            r0.scrollTo(r10, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.education.bloom.mathview.render.LatexEditText.bringPointIntoView(int):boolean");
    }

    /* renamed from: c */
    public final void mo17331c(Typeface typeface) {
        Editable text = getText();
        if (text != null) {
            C9111q[] qVarArr = (C9111q[]) text.getSpans(0, length(), C9111q.class);
            if (qVarArr != null) {
                for (C9111q qVar : qVarArr) {
                    qVar.f31380a.mo49047l(typeface);
                }
            }
        }
        if (!C69664n.m101066l(this.f31278k, typeface)) {
            this.f31278k = typeface;
            invalidate();
            requestLayout();
        }
    }

    /* renamed from: d */
    public final void mo17332d() {
        LatexKeyboardView latexKeyboardView = this.f31270b;
        if (latexKeyboardView != null) {
            latexKeyboardView.setVisibility(0);
            EditorInfo editorInfo = new EditorInfo();
            latexKeyboardView.f31306c = onCreateInputConnection(editorInfo);
            latexKeyboardView.f31307d = editorInfo;
            ImeButton imeButton = (ImeButton) latexKeyboardView.f31304a.mo5768a();
            if ((editorInfo.imeOptions & PrivateKeyType.INVALID) == 1) {
                imeButton.f31301c.setVisibility(8);
                imeButton.f31302d.setVisibility(8);
            } else {
                imeButton.f31302d.setVisibility(0);
                CharSequence charSequence = editorInfo.actionLabel;
                if (charSequence == null || C69764m.m101229h(charSequence)) {
                    imeButton.f31301c.setVisibility(8);
                } else {
                    imeButton.f31301c.setText(editorInfo.actionLabel);
                    imeButton.f31301c.setVisibility(0);
                }
                Integer valueOf = Integer.valueOf(editorInfo.imeOptions & PrivateKeyType.INVALID);
                if (valueOf.intValue() == 0) {
                    valueOf = null;
                }
                int intValue = valueOf != null ? valueOf.intValue() : 6;
                imeButton.f31301c.setVisibility(8);
                imeButton.f31302d.setVisibility(0);
                AppCompatImageView appCompatImageView = imeButton.f31302d;
                Map map = ImeButton.f31299a;
                Integer valueOf2 = Integer.valueOf(intValue);
                Integer num = (Integer) map.get(valueOf2);
                if (num != null) {
                    appCompatImageView.setImageResource(num.intValue());
                    AppCompatImageView appCompatImageView2 = imeButton.f31302d;
                    Context context = imeButton.getContext();
                    Integer num2 = (Integer) ImeButton.f31300b.get(valueOf2);
                    if (num2 != null) {
                        appCompatImageView2.setContentDescription(context.getString(num2.intValue()));
                        imeButton.f31302d.setScaleX(intValue == 7 ? -1.0f : 1.0f);
                    } else {
                        throw new IllegalArgumentException("Invalid actionId(" + intValue + ")");
                    }
                } else {
                    throw new IllegalArgumentException("Invalid actionId(" + intValue + ")");
                }
            }
        }
        requestFocus();
    }

    /* renamed from: e */
    public final boolean mo17333e() {
        return getSelectionStart() != getSelectionEnd() || this.f31269a;
    }

    public final int getOffsetForPosition(float f, float f2) {
        C9111q[] qVarArr;
        C9111q qVar;
        int offsetForPosition = super.getOffsetForPosition(f, f2);
        Editable text = getText();
        if (text == null || (qVarArr = (C9111q[]) text.getSpans(offsetForPosition, offsetForPosition, C9111q.class)) == null || (qVar = (C9111q) C69531o.m100934k(qVarArr)) == null) {
            return offsetForPosition;
        }
        int lineForVertical = getLayout().getLineForVertical((int) ((f2 - ((float) getTotalPaddingTop())) + ((float) getScrollY())));
        int totalPaddingLeft = getTotalPaddingLeft();
        float primaryHorizontal = getLayout().getPrimaryHorizontal(text.getSpanStart(qVar));
        int scrollX = getScrollX();
        int totalPaddingTop = getTotalPaddingTop();
        int lineTop = getLayout().getLineTop(lineForVertical);
        int scrollY = getScrollY();
        C45206d dVar = qVar.f31380a;
        C45937b bVar = new C45937b((double) (((f - ((float) totalPaddingLeft)) - primaryHorizontal) + ((float) scrollX)), (double) ((((f2 - ((float) totalPaddingTop)) - ((float) lineTop)) + ((float) scrollY)) - ((float) qVar.f31382c)));
        C45698o g = dVar.mo49039g();
        double d = bVar.f120725a;
        int i = dVar.getBounds().left;
        float c = dVar.mo49034c();
        double c2 = dVar.mo49043h().mo50049c();
        double d2 = (double) i;
        Double.isNaN(d2);
        double d3 = d - d2;
        double d4 = (double) c;
        Double.isNaN(d4);
        double b = g.mo49787b((d3 * d4) + c2);
        C45698o g2 = dVar.mo49039g();
        double d5 = bVar.f120726b;
        int i2 = dVar.getBounds().top;
        float d6 = dVar.mo49035d();
        double d7 = dVar.mo49043h().mo50050d();
        double d8 = (double) i2;
        Double.isNaN(d8);
        double d9 = d5 - d8;
        double d10 = (double) d6;
        Double.isNaN(d10);
        C45937b bVar2 = new C45937b(b, g2.mo49788c((d9 * d10) + d7));
        C45705v vVar = qVar.f31381b;
        C45795y yVar = (C45795y) vVar;
        int max = Math.max(0, yVar.mo49916r().mo50018o(new C45937b(bVar2.f120725a, bVar2.f120726b), C45944i.f120734c).mo49995a());
        if (max >= 0 && max <= yVar.f120411g.length()) {
            max = ((Integer) yVar.f120414j.mo49815d(yVar.mo49913o(max))).intValue();
        }
        yVar.mo49801b(new C45685b(max, max));
        return yVar.f120412h.mo49743a();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C59052c cVar = (C59052c) f31268c.mo56224b();
        cVar.mo56379ah(new C59094n(3));
        cVar.mo56386p("on Attach to Window");
        this.f31273f = this.f31271d.scheduleAtFixedRate(this.f31272e, 0, 500, TimeUnit.MILLISECONDS);
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        C69664n.m101061g(editorInfo, "editorInfo");
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null) {
            return new C9058b(onCreateInputConnection, new C9108n(this));
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C59052c cVar = (C59052c) f31268c.mo56224b();
        cVar.mo56379ah(new C59094n(4));
        cVar.mo56386p("on DetachedWindow");
        ScheduledFuture scheduledFuture = this.f31273f;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: com.google.android.apps.education.bloom.mathview.render.q} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r7) {
        /*
            r6 = this;
            java.lang.String r0 = "canvas"
            p5462h.p5473f.p5475b.C69664n.m101061g(r7, r0)
            super.onDraw(r7)
            android.graphics.Rect r0 = r6.m23590f()
            r7.getClipBounds(r0)
            android.graphics.Rect r0 = r6.m23590f()
            int r0 = r0.left
            int r1 = r6.getPaddingLeft()
            int r0 = r0 + r1
            android.graphics.Rect r1 = r6.m23590f()
            int r1 = r1.top
            int r2 = r6.getPaddingTop()
            int r1 = r1 + r2
            android.graphics.Rect r2 = r6.m23590f()
            int r2 = r2.right
            int r3 = r6.getPaddingRight()
            int r2 = r2 - r3
            android.graphics.Rect r3 = r6.m23590f()
            int r3 = r3.bottom
            int r4 = r6.getPaddingBottom()
            int r3 = r3 - r4
            r7.clipRect(r0, r1, r2, r3)
            boolean r0 = r6.isFocused()
            if (r0 == 0) goto L_0x00e6
            boolean r0 = r6.mo17333e()
            if (r0 != 0) goto L_0x004c
            goto L_0x00e6
        L_0x004c:
            com.google.android.apps.education.bloom.mathview.render.f r0 = com.google.android.apps.education.bloom.mathview.render.C9068g.f31293a
            java.lang.Object r0 = r0.mo5126a()
            com.google.android.apps.education.bloom.mathview.render.g r0 = (com.google.android.apps.education.bloom.mathview.render.C9068g) r0
            android.text.Editable r1 = r6.getText()
            r2 = 0
            if (r1 == 0) goto L_0x0074
            int r3 = r6.getSelectionStart()
            int r4 = r6.getSelectionEnd()
            java.lang.Class<com.google.android.apps.education.bloom.mathview.render.q> r5 = com.google.android.apps.education.bloom.mathview.render.C9111q.class
            java.lang.Object[] r1 = r1.getSpans(r3, r4, r5)
            com.google.android.apps.education.bloom.mathview.render.q[] r1 = (com.google.android.apps.education.bloom.mathview.render.C9111q[]) r1
            if (r1 == 0) goto L_0x0074
            java.lang.Object r1 = p5462h.p5463a.C69531o.m100934k(r1)
            r2 = r1
            com.google.android.apps.education.bloom.mathview.render.q r2 = (com.google.android.apps.education.bloom.mathview.render.C9111q) r2
        L_0x0074:
            android.text.Editable r1 = r6.getText()
            if (r1 == 0) goto L_0x007f
            java.lang.String r1 = r1.toString()
            goto L_0x0081
        L_0x007f:
            java.lang.String r1 = ""
        L_0x0081:
            r0.f31294b = r1
            int r1 = r6.getSelectionStart()
            r0.f31295c = r1
            android.text.Layout r1 = r6.getLayout()
            android.text.Layout r3 = r6.getLayout()
            int r4 = r6.getSelectionStart()
            int r3 = r3.getLineForOffset(r4)
            android.graphics.Rect r4 = r6.m23590f()
            r1.getLineBounds(r3, r4)
            android.graphics.Rect r1 = r6.m23590f()
            int r1 = r1.height()
            r0.f31296d = r1
            r6.m23591g(r7, r2, r0)
            int r1 = r6.getSelectionStart()
            int r3 = r6.getSelectionEnd()
            if (r1 == r3) goto L_0x00e1
            int r1 = r6.getSelectionEnd()
            r0.f31295c = r1
            android.text.Layout r1 = r6.getLayout()
            android.text.Layout r3 = r6.getLayout()
            int r4 = r6.getSelectionEnd()
            int r3 = r3.getLineForOffset(r4)
            android.graphics.Rect r4 = r6.m23590f()
            r1.getLineBounds(r3, r4)
            android.graphics.Rect r1 = r6.m23590f()
            int r1 = r1.height()
            r0.f31296d = r1
            r6.m23591g(r7, r2, r0)
        L_0x00e1:
            com.google.android.apps.education.bloom.mathview.render.f r7 = com.google.android.apps.education.bloom.mathview.render.C9068g.f31293a
            r7.mo5127b(r0)
        L_0x00e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.education.bloom.mathview.render.LatexEditText.onDraw(android.graphics.Canvas):void");
    }

    /* access modifiers changed from: protected */
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z) {
            mo17332d();
        }
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        C9111q qVar;
        C69664n.m101061g(keyEvent, "event");
        if ((keyEvent.getFlags() & 2) == 0) {
            return false;
        }
        if (i == 67) {
            Editable text = getText();
            if (text == null) {
                return super.onKeyDown(67, keyEvent);
            }
            C9109o oVar = new C9109o(this, text);
            C9111q[] qVarArr = (C9111q[]) text.getSpans(getSelectionStart(), getSelectionEnd(), C9111q.class);
            C69788q qVar2 = null;
            if (!(qVarArr == null || (qVar = (C9111q) C69531o.m100934k(qVarArr)) == null)) {
                oVar.mo17419a(qVar, Integer.valueOf(text.getSpanStart(qVar)), Integer.valueOf(text.getSpanEnd(qVar)));
                qVar2 = C69788q.f186170a;
            }
            if (qVar2 == null) {
                C9111q b = mo17329b(BuildConfig.FLAVOR);
                if (b != null) {
                    oVar.mo17419a(b, Integer.valueOf(getSelectionStart()), Integer.valueOf(getSelectionEnd()));
                } else {
                    throw new RuntimeException("Failed to create empty math span");
                }
            }
            invalidate();
            requestLayout();
            return true;
        }
        if (i == 21) {
            if (getSelectionStart() != 0) {
                i = 21;
            }
            return true;
        }
        if (i == 22) {
            Editable text2 = getText();
            if (text2 == null || getSelectionStart() != text2.length()) {
                i = 22;
            }
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        C69664n.m101061g(keyEvent, "event");
        if ((keyEvent.getFlags() & 2) != 0) {
            return super.onKeyUp(i, keyEvent);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C69664n.m101061g(charSequence, "text");
        super.onTextChanged(charSequence, i, i2, i3);
        mo17332d();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C69664n.m101061g(motionEvent, "event");
        int selectionStart = getSelectionStart();
        this.f31279l.onTouchEvent(motionEvent);
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (getSelectionStart() != getSelectionEnd()) {
            setSelection(selectionStart);
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setAction(1);
            try {
                onTouchEvent = super.onTouchEvent(obtain);
            } finally {
                obtain.recycle();
            }
        } else if (motionEvent.getActionMasked() == 2 && motionEvent.getActionIndex() == 0) {
            setSelection(getOffsetForPosition(motionEvent.getX(), motionEvent.getY()));
        }
        return onTouchEvent;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LatexEditText(Context context, AttributeSet attributeSet, int i, int i2, C69659i iVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
