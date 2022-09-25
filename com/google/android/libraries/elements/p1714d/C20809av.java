package com.google.android.libraries.elements.p1714d;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import androidx.emoji.widget.C2219c;
import com.google.android.libraries.elements.interfaces.C21230a;
import com.google.android.libraries.elements.interfaces.C21256az;
import com.google.android.libraries.elements.interfaces.C21309p;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.internal.C21357r;
import com.google.protos.youtube.elements.C66148c;
import com.google.protos.youtube.elements.C66161cf;
import com.google.protos.youtube.elements.C66162cg;
import com.google.protos.youtube.elements.C66182d;
import com.google.protos.youtube.elements.C66216ec;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import java.text.BreakIterator;

/* renamed from: com.google.android.libraries.elements.d.av */
/* compiled from: PG */
public final class C20809av extends EditText implements TextView.OnEditorActionListener, View.OnFocusChangeListener {

    /* renamed from: b */
    private static final InputFilter[] f58260b = new InputFilter[0];

    /* renamed from: c */
    private static final ColorStateList f58261c = ColorStateList.valueOf(-3355444);

    /* renamed from: d */
    private static final BreakIterator f58262d = BreakIterator.getCharacterInstance();

    /* renamed from: a */
    public TextWatcher f58263a;

    /* renamed from: e */
    private C20808au f58264e;

    /* renamed from: f */
    private boolean f58265f;

    /* renamed from: g */
    private C2219c f58266g;

    /* renamed from: h */
    private final Handler f58267h = new Handler(Looper.getMainLooper());

    /* renamed from: i */
    private final boolean f58268i;

    public C20809av(Context context, boolean z) {
        super(context);
        this.f58268i = z;
    }

    /* renamed from: c */
    private final C2219c m39069c() {
        if (this.f58266g == null) {
            this.f58266g = new C2219c(this);
        }
        return this.f58266g;
    }

    /* renamed from: d */
    private static C21311r m39070d(EditText editText, String str, C21256az azVar) {
        C21309p k = C21311r.m40252k();
        C21230a aVar = (C21230a) k;
        aVar.f59560a = editText;
        aVar.f59565f = azVar;
        C66148c cVar = (C66148c) C66182d.f179960e.createBuilder();
        cVar.copyOnWrite();
        C66182d dVar = (C66182d) cVar.instance;
        str.getClass();
        dVar.f179962a |= 1;
        dVar.f179963b = str;
        C66182d dVar2 = (C66182d) cVar.build();
        C66161cf cfVar = (C66161cf) C66162cg.f179907f.createBuilder();
        cfVar.copyOnWrite();
        C66162cg cgVar = (C66162cg) cfVar.instance;
        dVar2.getClass();
        cgVar.f179911b = dVar2;
        cgVar.f179910a |= 1;
        boolean isFocused = editText.isFocused();
        cfVar.copyOnWrite();
        C66162cg cgVar2 = (C66162cg) cfVar.instance;
        cgVar2.f179910a |= 8;
        cgVar2.f179913d = isFocused;
        int selectionEnd = editText.getSelectionEnd();
        cfVar.copyOnWrite();
        C66162cg cgVar3 = (C66162cg) cfVar.instance;
        cgVar3.f179910a |= 2;
        cgVar3.f179912c = selectionEnd;
        BreakIterator breakIterator = f58262d;
        breakIterator.setText(str);
        breakIterator.first();
        int i = 0;
        while (f58262d.next() != -1) {
            i++;
        }
        cfVar.copyOnWrite();
        C66162cg cgVar4 = (C66162cg) cfVar.instance;
        cgVar4.f179910a |= 16;
        cgVar4.f179914e = i;
        C66216ec ecVar = (C66216ec) SenderStateOuterClass$SenderState.f179521a.createBuilder();
        ecVar.mo58885m(C66162cg.f179908g, (C66162cg) cfVar.build());
        aVar.f59563d = (SenderStateOuterClass$SenderState) ecVar.build();
        return k.mo26698a();
    }

    /* renamed from: a */
    public final void mo25893a() {
        C20775a aVar = (C20775a) this.f58264e;
        C21357r rVar = aVar.f58118d;
        if (rVar != null) {
            aVar.f58122h.mo26124a(rVar.mo26862a(), m39070d(this, getText().toString(), ((C20775a) this.f58264e).f58124j.mo26806h())).mo61453k();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01c4  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25894b(com.youtube.p5283a.p5284a.C68038aa r19, com.google.android.libraries.elements.p1714d.C20808au r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r0.f58264e = r1
            com.youtube.a.a.g r3 = r19.mo60089m()
            com.youtube.a.a.g r2 = r19.mo60089m()
            if (r2 == 0) goto L_0x0019
            com.youtube.a.a.g r2 = r19.mo60089m()
            java.lang.String r2 = r2.mo60230y()
            goto L_0x001a
        L_0x0019:
            r2 = 0
        L_0x001a:
            r9 = r2
            r2 = 2
            r4 = 0
            if (r3 == 0) goto L_0x004b
            r5 = 0
        L_0x0020:
            int r6 = r3.mo60222q()
            if (r5 >= r6) goto L_0x0050
            com.youtube.a.a.bi r6 = r3.mo60228w(r5)
            if (r6 != 0) goto L_0x002d
            goto L_0x0048
        L_0x002d:
            long r7 = r6.mo60189r()
            r10 = 0
            int r12 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0048
            float r5 = r6.mo60180h()
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x0050
            float r5 = r6.mo60180h()
            r0.setTextSize(r2, r5)
            goto L_0x0050
        L_0x0048:
            int r5 = r5 + 1
            goto L_0x0020
        L_0x004b:
            r5 = 1096810496(0x41600000, float:14.0)
            r0.setTextSize(r2, r5)
        L_0x0050:
            com.google.android.libraries.elements.d.a r1 = (com.google.android.libraries.elements.p1714d.C20775a) r1
            boolean r5 = r1.f58121g
            r6 = 1
            if (r5 == 0) goto L_0x0068
            boolean r5 = r0.f58265f
            if (r5 != 0) goto L_0x0068
            boolean r5 = com.google.android.libraries.elements.C21366j.f59736a
            if (r5 == 0) goto L_0x0068
            r0.f58265f = r6
            android.text.method.KeyListener r5 = super.getKeyListener()
            r0.setKeyListener(r5)
        L_0x0068:
            com.youtube.a.a.g r12 = r19.mo60088l()
            if (r12 == 0) goto L_0x0096
            com.google.android.libraries.elements.d.au r5 = r0.f58264e
            com.google.android.libraries.elements.d.a r5 = (com.google.android.libraries.elements.p1714d.C20775a) r5
            com.google.android.libraries.elements.interfaces.z r10 = r5.f58124j
            android.content.Context r11 = r18.getContext()
            com.google.android.libraries.elements.d.au r5 = r0.f58264e
            com.google.android.libraries.elements.d.a r5 = (com.google.android.libraries.elements.p1714d.C20775a) r5
            com.google.android.libraries.elements.interfaces.t r13 = r5.f58122h
            com.google.android.libraries.elements.interfaces.cl r14 = r5.f58119e
            com.google.android.libraries.elements.interfaces.bb r15 = r5.f58120f
            com.google.common.b.hd r7 = r5.f58123i
            boolean r5 = r5.f58121g
            r16 = r7
            r17 = r5
            java.lang.CharSequence r5 = com.google.android.libraries.elements.p1714d.C21071eg.m39589f(r10, r11, r12, r13, r14, r15, r16, r17)
            r0.setHint(r5)
            android.content.res.ColorStateList r5 = f58261c
            r0.setHintTextColor(r5)
        L_0x0096:
            int r5 = r19.mo60083g()
            r7 = 3
            if (r5 == r2) goto L_0x00aa
            if (r5 == r7) goto L_0x00a7
            r8 = 4
            if (r5 == r8) goto L_0x00a4
            r5 = 0
            goto L_0x00ac
        L_0x00a4:
            r5 = 4096(0x1000, float:5.74E-42)
            goto L_0x00ac
        L_0x00a7:
            r5 = 8192(0x2000, float:1.14794E-41)
            goto L_0x00ac
        L_0x00aa:
            r5 = 16384(0x4000, float:2.2959E-41)
        L_0x00ac:
            int r8 = r19.mo60085i()
            switch(r8) {
                case 2: goto L_0x00cc;
                case 3: goto L_0x00ca;
                case 4: goto L_0x00c7;
                case 5: goto L_0x00c4;
                case 6: goto L_0x00c1;
                case 7: goto L_0x00be;
                case 8: goto L_0x00b3;
                case 9: goto L_0x00c4;
                default: goto L_0x00b3;
            }
        L_0x00b3:
            int r8 = r19.mo60086j()
            if (r8 != r6) goto L_0x00ce
            r0.setLines(r6)
            r8 = 1
            goto L_0x00dc
        L_0x00be:
            r8 = 96
            goto L_0x00dc
        L_0x00c1:
            r8 = 16
            goto L_0x00dc
        L_0x00c4:
            r8 = 32
            goto L_0x00dc
        L_0x00c7:
            r8 = 8194(0x2002, float:1.1482E-41)
            goto L_0x00dc
        L_0x00ca:
            r8 = 3
            goto L_0x00dc
        L_0x00cc:
            r8 = 2
            goto L_0x00dc
        L_0x00ce:
            r0.setMinLines(r6)
            if (r8 > r6) goto L_0x00d6
            r8 = 2147483647(0x7fffffff, float:NaN)
        L_0x00d6:
            r0.setMaxLines(r8)
            r8 = 131073(0x20001, float:1.83672E-40)
        L_0x00dc:
            r5 = r5 | r8
            com.google.android.libraries.elements.d.au r8 = r0.f58264e
            com.google.android.libraries.elements.d.a r8 = (com.google.android.libraries.elements.p1714d.C20775a) r8
            com.google.android.libraries.elements.internal.r r8 = r8.f58118d
            if (r8 != 0) goto L_0x00e8
        L_0x00e5:
            r8 = 0
            goto L_0x01af
        L_0x00e8:
            int r10 = r19.mo60085i()
            r11 = 8
            if (r10 == r11) goto L_0x00ff
            int r10 = r19.mo60085i()
            if (r10 == r6) goto L_0x00ff
            int r10 = r19.mo60085i()
            if (r10 != 0) goto L_0x00fd
            goto L_0x00ff
        L_0x00fd:
            r10 = 0
            goto L_0x0100
        L_0x00ff:
            r10 = 1
        L_0x0100:
            int r11 = r19.mo60086j()
            if (r11 == r6) goto L_0x01aa
            if (r10 != 0) goto L_0x010a
            goto L_0x01aa
        L_0x010a:
            com.google.protos.youtube.elements.CommandOuterClass$Command r8 = r8.mo26862a()
            if (r8 != 0) goto L_0x0112
            goto L_0x019d
        L_0x0112:
            com.google.protobuf.bt r10 = com.google.protos.youtube.elements.p5165a.C66018f.f179538b
            com.google.protobuf.bt r10 = com.google.protobuf.C62942bv.checkIsLite(r10)
            r8.mo58887l(r10)
            com.google.protobuf.bf r11 = r8.f169962ag
            com.google.protobuf.bs r10 = r10.f169971d
            boolean r10 = r11.mo58857o(r10)
            if (r10 == 0) goto L_0x0126
            goto L_0x017a
        L_0x0126:
            com.google.protobuf.bt r10 = com.google.protos.youtube.elements.C66218ee.f180063c
            com.google.protobuf.bt r10 = com.google.protobuf.C62942bv.checkIsLite(r10)
            r8.mo58887l(r10)
            com.google.protobuf.bf r11 = r8.f169962ag
            com.google.protobuf.bs r10 = r10.f169971d
            boolean r10 = r11.mo58857o(r10)
            if (r10 == 0) goto L_0x019d
            com.google.protobuf.bt r10 = com.google.protos.youtube.elements.C66218ee.f180063c
            com.google.protobuf.bt r10 = com.google.protobuf.C62942bv.checkIsLite(r10)
            r8.mo58887l(r10)
            com.google.protobuf.bf r8 = r8.f169962ag
            com.google.protobuf.bs r11 = r10.f169971d
            java.lang.Object r8 = r8.mo58854l(r11)
            if (r8 != 0) goto L_0x014f
            java.lang.Object r8 = r10.f169969b
            goto L_0x0153
        L_0x014f:
            java.lang.Object r8 = r10.mo58889c(r8)
        L_0x0153:
            com.google.protos.youtube.elements.ee r8 = (com.google.protos.youtube.elements.C66218ee) r8
            com.google.protobuf.cq r8 = r8.f180065a
            java.util.Iterator r8 = r8.iterator()
        L_0x015b:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x019d
            java.lang.Object r10 = r8.next()
            com.google.protos.youtube.elements.CommandOuterClass$Command r10 = (com.google.protos.youtube.elements.CommandOuterClass$Command) r10
            com.google.protobuf.bt r11 = com.google.protos.youtube.elements.p5165a.C66018f.f179538b
            com.google.protobuf.bt r11 = com.google.protobuf.C62942bv.checkIsLite(r11)
            r10.mo58887l(r11)
            com.google.protobuf.bf r10 = r10.f169962ag
            com.google.protobuf.bs r11 = r11.f169971d
            boolean r10 = r10.mo58857o(r11)
            if (r10 == 0) goto L_0x015b
        L_0x017a:
            r8 = -131073(0xfffffffffffdffff, float:NaN)
            r8 = r8 & r5
            int r10 = r18.getImeOptions()
            r11 = 6
            r0.setImeOptions(r11)
            if (r10 == r11) goto L_0x0199
            android.content.Context r10 = r18.getContext()
            java.lang.String r11 = "input_method"
            java.lang.Object r10 = r10.getSystemService(r11)
            android.view.inputmethod.InputMethodManager r10 = (android.view.inputmethod.InputMethodManager) r10
            if (r10 == 0) goto L_0x0199
            r10.restartInput(r0)
        L_0x0199:
            r0.setOnEditorActionListener(r0)
            goto L_0x01af
        L_0x019d:
            android.text.TextWatcher r8 = r0.f58263a
            if (r8 != 0) goto L_0x00e5
            com.google.android.libraries.elements.d.at r8 = new com.google.android.libraries.elements.d.at
            r8.<init>(r0)
            r0.f58263a = r8
            goto L_0x00e5
        L_0x01aa:
            r0.setOnEditorActionListener(r0)
            goto L_0x00e5
        L_0x01af:
            if (r8 == 0) goto L_0x01b5
            r0.setRawInputType(r8)
            goto L_0x01be
        L_0x01b5:
            int r8 = r18.getInputType()
            if (r5 == r8) goto L_0x01be
            r0.setInputType(r5)
        L_0x01be:
            int r5 = r19.mo60084h()
            if (r5 != r6) goto L_0x01cc
            android.graphics.drawable.ColorDrawable r5 = new android.graphics.drawable.ColorDrawable
            r5.<init>(r4)
            r0.setBackground(r5)
        L_0x01cc:
            com.google.android.libraries.elements.d.au r4 = r0.f58264e
            com.google.android.libraries.elements.d.a r4 = (com.google.android.libraries.elements.p1714d.C20775a) r4
            com.google.android.libraries.elements.internal.r r5 = r4.f58116b
            if (r5 != 0) goto L_0x01d8
            com.google.android.libraries.elements.internal.r r4 = r4.f58117c
            if (r4 == 0) goto L_0x01db
        L_0x01d8:
            r0.setOnFocusChangeListener(r0)
        L_0x01db:
            boolean r4 = r19.mo60094r()
            boolean r5 = r18.isFocused()
            if (r4 == 0) goto L_0x01f2
            if (r5 != 0) goto L_0x01f2
            android.os.Handler r4 = r0.f58267h
            com.google.android.libraries.elements.d.ar r5 = new com.google.android.libraries.elements.d.ar
            r5.<init>(r0)
            r4.post(r5)
            goto L_0x0200
        L_0x01f2:
            if (r4 != 0) goto L_0x0200
            if (r5 == 0) goto L_0x0200
            android.os.Handler r4 = r0.f58267h
            com.google.android.libraries.elements.d.as r5 = new com.google.android.libraries.elements.d.as
            r5.<init>(r0)
            r4.post(r5)
        L_0x0200:
            long r4 = r19.mo60087k()
            int r5 = (int) r4
            if (r5 == 0) goto L_0x021f
            android.graphics.PorterDuffColorFilter r4 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r8 = android.graphics.PorterDuff.Mode.SRC_IN
            r4.<init>(r5, r8)
            android.graphics.drawable.Drawable r8 = r18.getTextCursorDrawable()
            r8.setColorFilter(r4)
            r0.setTextCursorDrawable(r8)
            android.content.res.ColorStateList r4 = android.content.res.ColorStateList.valueOf(r5)
            androidx.core.p098j.C2043bi.m5531Y(r0, r4)
        L_0x021f:
            r4 = 5
            r0.setTextAlignment(r4)
            r5 = 8388611(0x800003, float:1.1754948E-38)
            r0.setGravity(r5)
            if (r3 == 0) goto L_0x0281
            if (r9 == 0) goto L_0x0281
            android.text.Editable r8 = r18.getText()
            java.lang.String r8 = r8.toString()
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x0281
            int r8 = r3.mo60217h()
            if (r8 == r6) goto L_0x0254
            if (r8 == r2) goto L_0x0250
            if (r8 == r7) goto L_0x024c
            r0.setGravity(r5)
            r0.setTextAlignment(r4)
            goto L_0x0257
        L_0x024c:
            r0.setGravity(r6)
            goto L_0x0257
        L_0x0250:
            r0.setGravity(r4)
            goto L_0x0257
        L_0x0254:
            r0.setGravity(r7)
        L_0x0257:
            android.text.InputFilter[] r2 = f58260b
            r0.setFilters(r2)
            com.google.android.libraries.elements.interfaces.z r2 = r1.f58124j
            android.content.Context r4 = r18.getContext()
            com.google.android.libraries.elements.interfaces.t r5 = r1.f58122h
            com.google.android.libraries.elements.interfaces.cl r6 = r1.f58119e
            com.google.android.libraries.elements.interfaces.bb r7 = r1.f58120f
            com.google.common.b.hd r8 = r1.f58123i
            boolean r10 = r1.f58121g
            r1 = r2
            r2 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r10
            java.lang.CharSequence r1 = com.google.android.libraries.elements.p1714d.C21071eg.m39589f(r1, r2, r3, r4, r5, r6, r7, r8)
            r0.setTextKeepState(r1)
            int r1 = r9.length()
            r0.setSelection(r1)
        L_0x0281:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.elements.p1714d.C20809av.mo25894b(com.youtube.a.a.aa, com.google.android.libraries.elements.d.au):void");
    }

    public final void invalidate() {
        if (!this.f58268i) {
            super.invalidate();
        }
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        return this.f58265f ? m39069c().mo5535a(onCreateInputConnection, editorInfo) : onCreateInputConnection;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        C20808au auVar = this.f58264e;
        if (auVar == null || ((C20775a) auVar).f58118d == null) {
            return false;
        }
        mo25893a();
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r2 = (com.google.android.libraries.elements.p1714d.C20775a) r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
        /*
            r0 = this;
            super.onTextChanged(r1, r2, r3, r4)
            com.google.android.libraries.elements.d.au r2 = r0.f58264e
            if (r2 != 0) goto L_0x0008
            return
        L_0x0008:
            com.google.android.libraries.elements.d.a r2 = (com.google.android.libraries.elements.p1714d.C20775a) r2
            com.google.android.libraries.elements.internal.r r3 = r2.f58115a
            if (r3 == 0) goto L_0x002d
            com.google.android.libraries.elements.interfaces.t r2 = r2.f58122h
            com.google.protos.youtube.elements.CommandOuterClass$Command r3 = r3.mo26862a()
            java.lang.String r1 = r1.toString()
            com.google.android.libraries.elements.d.au r4 = r0.f58264e
            com.google.android.libraries.elements.d.a r4 = (com.google.android.libraries.elements.p1714d.C20775a) r4
            com.google.android.libraries.elements.interfaces.z r4 = r4.f58124j
            com.google.android.libraries.elements.interfaces.az r4 = r4.mo26806h()
            com.google.android.libraries.elements.interfaces.r r1 = m39070d(r0, r1, r4)
            io.b.a r1 = r2.mo26124a(r3, r1)
            r1.mo61453k()
        L_0x002d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.elements.p1714d.C20809av.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    public final void setBackground(Drawable drawable) {
        if (this.f58268i && drawable != null) {
            drawable.mutate();
        }
        super.setBackground(drawable);
    }

    public final void setKeyListener(KeyListener keyListener) {
        if (this.f58265f && keyListener != null) {
            keyListener = m39069c().f6273a.mo5534a(keyListener);
        }
        super.setKeyListener(keyListener);
    }

    public final void onFocusChange(View view, boolean z) {
        C20808au auVar = this.f58264e;
        if (auVar != null) {
            C20775a aVar = (C20775a) auVar;
            C21357r rVar = aVar.f58116b;
            if (!z || rVar == null) {
                C21357r rVar2 = aVar.f58117c;
                if (!z && rVar2 != null) {
                    aVar.f58122h.mo26124a(rVar2.mo26862a(), m39070d(this, getText().toString(), ((C20775a) this.f58264e).f58124j.mo26806h())).mo61453k();
                    return;
                }
                return;
            }
            aVar.f58122h.mo26124a(rVar.mo26862a(), m39070d(this, getText().toString(), ((C20775a) this.f58264e).f58124j.mo26806h())).mo61453k();
        }
    }
}
