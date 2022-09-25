package com.google.android.apps.gsa.assistant.settings.features.payments;

import android.webkit.JavascriptInterface;
import com.google.android.apps.gsa.assistant.settings.p526e.C9751c;
import com.google.android.apps.gsa.assistant.settings.shared.h;
import com.google.android.apps.gsa.assistant.settings.shared.p5792c.C73740a;
import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.search.shared.service.C87677ae;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87827fa;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    	at jadx.core.utils.BlockUtils.isAllBlocksEmpty(BlockUtils.java:564)
    	at jadx.core.dex.visitors.ExtractFieldInit.getConstructorsList(ExtractFieldInit.java:245)
    	at jadx.core.dex.visitors.ExtractFieldInit.moveCommonFieldsInit(ExtractFieldInit.java:126)
    	at jadx.core.dex.visitors.ExtractFieldInit.visit(ExtractFieldInit.java:46)
    */
/* renamed from: com.google.android.apps.gsa.assistant.settings.features.payments.ae */
/* compiled from: PG */
public final class C73295ae implements C73740a, C87682aj {

    /* renamed from: a */
    public final C9751c f194175a;

    /* renamed from: b */
    private final C91097g f194176b;

    /* renamed from: c */
    private final C84516aa f194177c;

    /* renamed from: d */
    private final h f194178d;

    /* renamed from: e */
    private Optional f194179e;

    /* renamed from: f */
    private final bv f194180f;

    /* renamed from: g */
    private final C87677ae f194181g;

    /* renamed from: h */
    private Optional f194182h;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.features.payments.ae.<init>(com.google.android.apps.gsa.shared.util.t.g, com.google.android.apps.gsa.assistant.settings.e.c, com.google.android.apps.gsa.search.core.aj.aa, com.google.android.apps.gsa.assistant.settings.shared.h, com.google.android.apps.gsa.assistant.settings.features.payments.bv, com.google.android.apps.gsa.search.shared.service.ae):void, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public C73295ae(com.google.android.apps.gsa.shared.util.p7184t.C91097g r1, com.google.android.apps.gsa.assistant.settings.p526e.C9751c r2, com.google.android.apps.gsa.search.core.p6513aj.C84516aa r3, com.google.android.apps.gsa.assistant.settings.shared.h r4, com.google.android.apps.gsa.assistant.settings.features.payments.bv r5, com.google.android.apps.gsa.search.shared.service.C87677ae r6) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.features.payments.ae.<init>(com.google.android.apps.gsa.shared.util.t.g, com.google.android.apps.gsa.assistant.settings.e.c, com.google.android.apps.gsa.search.core.aj.aa, com.google.android.apps.gsa.assistant.settings.shared.h, com.google.android.apps.gsa.assistant.settings.features.payments.bv, com.google.android.apps.gsa.search.shared.service.ae):void, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.settings.features.payments.C73295ae.<init>(com.google.android.apps.gsa.shared.util.t.g, com.google.android.apps.gsa.assistant.settings.e.c, com.google.android.apps.gsa.search.core.aj.aa, com.google.android.apps.gsa.assistant.settings.shared.h, com.google.android.apps.gsa.assistant.settings.features.payments.bv, com.google.android.apps.gsa.search.shared.service.ae):void");
    }

    /* renamed from: d */
    private final boolean m107997d() {
        if (this.f194179e.isEmpty() || ((C87827fa) this.f194179e.get()).f237639a == 5 || ((C87827fa) this.f194179e.get()).f237639a != 6) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final String mo18002a() {
        return "paymentsSystemInterface";
    }

    /* renamed from: b */
    public final /* synthetic */ void mo18003b() {
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.features.payments.ae.fM(com.google.android.apps.gsa.search.shared.service.ServiceEventData):void, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    /* renamed from: fM */
    public final void mo19965fM(com.google.android.apps.gsa.search.shared.service.ServiceEventData r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.features.payments.ae.fM(com.google.android.apps.gsa.search.shared.service.ServiceEventData):void, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.settings.features.payments.C73295ae.mo19965fM(com.google.android.apps.gsa.search.shared.service.ServiceEventData):void");
    }

    @JavascriptInterface
    public int getVersion() {
        return 0;
    }

    @JavascriptInterface
    public boolean hasScreenLock() {
        C84516aa aaVar = this.f194177c;
        C90476a aVar = C91018d.f254254a;
        boolean isKeyguardSecure = aaVar.f230023b.isKeyguardSecure();
        C58976aa aaVar2 = C58975e.f156826a;
        return isKeyguardSecure;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.features.payments.ae.startPaymentsOobe():void, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public void startPaymentsOobe() {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.features.payments.ae.startPaymentsOobe():void, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.settings.features.payments.C73295ae.startPaymentsOobe():void");
    }
}
