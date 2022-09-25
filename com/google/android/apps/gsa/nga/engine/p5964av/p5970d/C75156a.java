package com.google.android.apps.gsa.nga.engine.p5964av.p5970d;

import android.content.Context;
import com.google.android.apps.gsa.nga.engine.p5900ag.C74820be;
import com.google.android.apps.gsa.nga.engine.p5964av.C75050a;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.p6294a.C80495c;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.p6294a.C80496d;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82879dv;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82881dx;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import com.google.android.libraries.p1730f.C21370a;

/* renamed from: com.google.android.apps.gsa.nga.engine.av.d.a */
/* compiled from: PG */
public final class C75156a {

    /* renamed from: a */
    private final Context f209573a;

    /* renamed from: b */
    private final C21370a f209574b;

    /* renamed from: c */
    private final C83334w f209575c;

    /* renamed from: d */
    private final C75050a f209576d;

    /* renamed from: e */
    private C80496d f209577e;

    /* renamed from: f */
    private boolean f209578f;

    /* renamed from: g */
    private final C74820be f209579g;

    public C75156a(C74820be beVar, C75050a aVar, Context context, C21370a aVar2, C83334w wVar) {
        this.f209579g = beVar;
        this.f209576d = aVar;
        this.f209573a = context;
        this.f209574b = aVar2;
        this.f209575c = wVar;
    }

    /* renamed from: d */
    private final C80495c m121426d() {
        C80495c cVar = (C80495c) C80496d.f220968e.createBuilder();
        boolean d = this.f209579g.mo71219d();
        cVar.copyOnWrite();
        ((C80496d) cVar.instance).f220970a = d;
        boolean c = this.f209579g.mo71218c();
        cVar.copyOnWrite();
        ((C80496d) cVar.instance).f220971b = c;
        return cVar;
    }

    /* renamed from: e */
    private final void m121427e(int i) {
        C83334w wVar = this.f209575c;
        C82887ec ecVar = C82887ec.MULTI_DEVICE_ARBITRATION;
        C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
        C82879dv dvVar = (C82879dv) C82881dx.f225971c.createBuilder();
        dvVar.copyOnWrite();
        C82881dx dxVar = (C82881dx) dvVar.instance;
        dxVar.f225974b = i - 1;
        dxVar.f225973a |= 1;
        C82881dx dxVar2 = (C82881dx) dvVar.build();
        dzVar.copyOnWrite();
        C82885ea eaVar = (C82885ea) dzVar.instance;
        dxVar2.getClass();
        eaVar.f225980b = dxVar2;
        eaVar.f225979a = 105;
        wVar.mo75543a(ecVar, (C82885ea) dzVar.build());
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.nga.engine.av.d.a.a():j$.util.Optional, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    /* renamed from: a */
    public final synchronized p3186j$.util.Optional mo71503a() {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.nga.engine.av.d.a.a():j$.util.Optional, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.p5964av.p5970d.C75156a.mo71503a():j$.util.Optional");
    }

    /* renamed from: b */
    public final synchronized void mo71504b() {
        m121427e(2);
        this.f209577e = (C80496d) m121426d().build();
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.nga.engine.av.d.a.c(com.google.android.apps.gsa.shared.speech.hotword.HotwordResult):void, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    /* renamed from: c */
    public final synchronized void mo71505c(com.google.android.apps.gsa.shared.speech.hotword.HotwordResult r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.nga.engine.av.d.a.c(com.google.android.apps.gsa.shared.speech.hotword.HotwordResult):void, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.p5964av.p5970d.C75156a.mo71505c(com.google.android.apps.gsa.shared.speech.hotword.HotwordResult):void");
    }
}
