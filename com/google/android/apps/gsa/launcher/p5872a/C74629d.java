package com.google.android.apps.gsa.launcher.p5872a;

import com.android.launcher3.Launcher;
import com.android.launcher3.allapps.DefaultAppSearchController;
import com.google.android.apps.gsa.shared.util.p7159c.C90932cb;
import com.google.android.apps.gsa.shared.util.p7159c.C90936cf;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1859d.C22791m;

/* renamed from: com.google.android.apps.gsa.launcher.a.d */
/* compiled from: PG */
public final class C74629d {

    /* renamed from: a */
    public final C91142g f208804a;

    /* renamed from: b */
    public final Launcher f208805b;

    /* renamed from: c */
    public boolean f208806c;

    /* renamed from: d */
    public boolean f208807d;

    /* renamed from: e */
    public boolean f208808e;

    /* renamed from: f */
    public boolean f208809f;

    /* renamed from: g */
    public boolean f208810g;

    /* renamed from: h */
    public boolean f208811h;

    /* renamed from: i */
    public boolean f208812i = false;

    /* renamed from: j */
    public l f208813j;

    /* renamed from: k */
    public C22791m f208814k;

    /* renamed from: l */
    public k f208815l;

    /* renamed from: m */
    public final DefaultAppSearchController f208816m = new DefaultAppSearchController();

    /* renamed from: n */
    private final C90932cb f208817n;

    /* renamed from: o */
    private final C90936cf f208818o = new C74628a(this);

    public C74629d(C91142g gVar, C90932cb cbVar, Launcher launcher) {
        this.f208804a = gVar;
        this.f208817n = cbVar;
        this.f208805b = launcher;
    }

    /* renamed from: a */
    public final void mo70985a(int i) {
        this.f208817n.mo85149n(this.f208818o);
        if (i > 0) {
            this.f208817n.mo85150o(this.f208818o, (long) i);
        } else {
            this.f208818o.run();
        }
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.launcher.a.d.b():boolean, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    /* renamed from: b */
    public final boolean mo70986b() {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.launcher.a.d.b():boolean, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.launcher.p5872a.C74629d.mo70986b():boolean");
    }
}
