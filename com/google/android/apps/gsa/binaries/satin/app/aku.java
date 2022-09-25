package com.google.android.apps.gsa.binaries.satin.app;

import android.content.ContentResolver;
import android.content.res.Resources;
import com.google.android.apps.gsa.assistant.settings.features.people.utils.af;
import com.google.android.apps.gsa.assistant.settings.features.people.utils.n;
import com.google.android.apps.gsa.assistant.shared.p5817h.C73872d;
import com.google.android.apps.gsa.contacts.m;
import com.google.android.apps.gsa.search.core.p6805i.C86106b;
import com.google.android.apps.gsa.shared.p7066m.C90021c;

/*  JADX ERROR: NullPointerException in pass: ClassModifier
    java.lang.NullPointerException
    	at jadx.core.utils.BlockUtils.collectAllInsns(BlockUtils.java:574)
    	at jadx.core.dex.visitors.ClassModifier.removeBridgeMethod(ClassModifier.java:220)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticMethods(ClassModifier.java:151)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:58)
    */
/* compiled from: PG */
final class aku implements C73872d {

    /* renamed from: a */
    private final aqy f196403a;

    /* renamed from: b */
    private final C73964bv f196404b;

    public aku(aqy aqy, C73964bv bvVar) {
        this.f196403a = aqy;
        this.f196404b = bvVar;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.binaries.satin.app.aku.a(android.support.v4.app.Fragment):void, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    /* renamed from: a */
    public final /* synthetic */ void mo65348a(android.support.p031v4.app.Fragment r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.binaries.satin.app.aku.a(android.support.v4.app.Fragment):void, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.binaries.satin.app.aku.mo65348a(android.support.v4.app.Fragment):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final n mo65582b() {
        return new n((ContentResolver) this.f196403a.h.mo17428b(), (m) this.f196403a.a.f202851eq.mo17428b(), (C86106b) this.f196403a.a.f203285n.mo17428b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final af mo65583c() {
        return new af((Resources) this.f196403a.hw.mo17428b(), (C90021c) this.f196403a.a.f202006C.mo17428b());
    }
}
