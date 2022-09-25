package com.google.android.apps.gsa.assistant.settings.p5781hq.agentdirectory;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.assistant.p3861at.abr;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.StarsRatingWidget */
/* compiled from: PG */
class StarsRatingWidget extends LinearLayout {

    /* renamed from: c */
    private static final C58485gu f194656c = null;

    /* renamed from: a */
    public int f194657a = 2;

    /* renamed from: b */
    public C73678fd f194658b;

    /* renamed from: d */
    private ImageButton[] f194659d;

    /* renamed from: e */
    private int f194660e;

    public StarsRatingWidget(Context context) {
        super(context);
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.StarsRatingWidget.a(com.google.assistant.at.abr):void, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    /* renamed from: a */
    public final void mo65063a(com.google.assistant.p3861at.abr r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.StarsRatingWidget.a(com.google.assistant.at.abr):void, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.settings.p5781hq.agentdirectory.StarsRatingWidget.mo65063a(com.google.assistant.at.abr):void");
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        int childCount = getChildCount();
        this.f194660e = childCount;
        this.f194659d = new ImageButton[childCount];
        for (int i = 0; i < this.f194660e; i++) {
            ImageButton imageButton = (ImageButton) getChildAt(i);
            imageButton.getClass();
            this.f194659d[i] = imageButton;
            C28292j jVar = new C28292j(36330 + i);
            jVar.mo33795i(5);
            C28295m.m52919e(imageButton, jVar);
            imageButton.setOnClickListener(new C73685fp(this, (abr) f194656c.get(i)));
        }
    }

    public StarsRatingWidget(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StarsRatingWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public StarsRatingWidget(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
