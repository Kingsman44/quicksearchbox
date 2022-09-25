package com.google.android.apps.gsa.launcher;

import android.content.Intent;
import android.text.style.URLSpan;
import android.view.View;
import com.android.launcher3.Launcher;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    	at jadx.core.utils.BlockUtils.isAllBlocksEmpty(BlockUtils.java:564)
    	at jadx.core.dex.visitors.ExtractFieldInit.getConstructorsList(ExtractFieldInit.java:245)
    	at jadx.core.dex.visitors.ExtractFieldInit.moveCommonFieldsInit(ExtractFieldInit.java:126)
    	at jadx.core.dex.visitors.ExtractFieldInit.visit(ExtractFieldInit.java:46)
    */
/* compiled from: PG */
public class GELConsentScreenFactory$IntentSpan extends URLSpan {

    /* renamed from: a */
    Launcher f208800a;

    /* renamed from: b */
    Intent f208801b;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.launcher.GELConsentScreenFactory$IntentSpan.<init>(com.android.launcher3.Launcher, android.content.Intent):void, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public GELConsentScreenFactory$IntentSpan(com.android.launcher3.Launcher r1, android.content.Intent r2) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.launcher.GELConsentScreenFactory$IntentSpan.<init>(com.android.launcher3.Launcher, android.content.Intent):void, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.launcher.GELConsentScreenFactory$IntentSpan.<init>(com.android.launcher3.Launcher, android.content.Intent):void");
    }

    public final void onClick(View view) {
        this.f208800a.startActivity(this.f208801b);
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.launcher.GELConsentScreenFactory$IntentSpan.updateDrawState(android.text.TextPaint):void, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void updateDrawState(android.text.TextPaint r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.launcher.GELConsentScreenFactory$IntentSpan.updateDrawState(android.text.TextPaint):void, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.launcher.GELConsentScreenFactory$IntentSpan.updateDrawState(android.text.TextPaint):void");
    }
}
