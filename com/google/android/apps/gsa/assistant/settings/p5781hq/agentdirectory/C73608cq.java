package com.google.android.apps.gsa.assistant.settings.p5781hq.agentdirectory;

import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0167am;
import android.util.SparseArray;
import android.view.View;
import com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.a.a;
import com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.network.f;
import com.google.android.apps.gsa.assistant.settings.p5781hq.agentdirectory.network.C73698d;
import com.google.android.apps.gsa.assistant.settings.p5781hq.agentdirectory.network.LifecycleAware;
import com.google.android.apps.gsa.assistant.settings.p5781hq.agentdirectory.p5784c.C73602a;
import com.google.android.apps.gsa.assistant.settings.shared.s;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.search.shared.p6930h.C87563f;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7148ui.p7155g.p7156a.C90679a;
import com.google.android.apps.gsa.shared.util.p7184t.C91096f;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.cq */
/* compiled from: PG */
public final class C73608cq extends em {

    /* renamed from: f */
    private static final C59071e f194734f = null;

    /* renamed from: a */
    public co f194735a;

    /* renamed from: b */
    public C73602a f194736b;

    /* renamed from: c */
    public dv f194737c;

    /* renamed from: d */
    int f194738d = 0;

    /* renamed from: e */
    public final SparseArray f194739e = new SparseArray();

    /* renamed from: g */
    private final C91097g f194740g = new C73607cp(this);

    /* renamed from: h */
    private cn f194741h;

    /* renamed from: i */
    private cr f194742i;

    /* JADX WARNING: type inference failed for: r14v0, types: [androidx.lifecycle.v, com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.em, android.support.v4.app.Fragment, com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.cq] */
    public final void onActivityCreated(Bundle bundle) {
        C73608cq.super.onActivityCreated(bundle);
        C0167am activity = getActivity();
        View view = getView();
        if (activity != null && view != null) {
            dv dvVar = this.f194737c;
            C91097g gVar = this.f194740g;
            Bundle arguments = getArguments();
            gVar.getClass();
            s sVar = (s) dvVar.a.mo17428b();
            sVar.getClass();
            C90679a aVar = (C90679a) dvVar.b.mo17428b();
            aVar.getClass();
            bm bmVar = (bm) dvVar.c.mo17428b();
            bmVar.getClass();
            C87563f fVar = (C87563f) dvVar.d.mo17428b();
            fVar.getClass();
            ((C90021c) dvVar.e.mo17428b()).getClass();
            ((ft) dvVar.f.mo17428b()).getClass();
            gd gdVar = (gd) dvVar.g.mo17428b();
            gdVar.getClass();
            fi fiVar = (fi) dvVar.h.mo17428b();
            fiVar.getClass();
            a aVar2 = (a) dvVar.i.mo17428b();
            aVar2.getClass();
            C73602a aVar3 = (C73602a) dvVar.j.mo17428b();
            aVar3.getClass();
            cr duVar = new du(view, activity, gVar, arguments, sVar, aVar, bmVar, fVar, gdVar, fiVar, aVar2, aVar3);
            this.f194742i = duVar;
            co coVar = this.f194735a;
            LifecycleAware lifecycleAware = new LifecycleAware(this);
            C73571aa aaVar = (C73571aa) coVar.a.mo17428b();
            aaVar.getClass();
            C73602a aVar4 = (C73602a) coVar.b.mo17428b();
            aVar4.getClass();
            C73698d dVar = (C73698d) coVar.c.mo17428b();
            dVar.getClass();
            f fVar2 = (f) coVar.d.mo17428b();
            fVar2.getClass();
            cn cnVar = new cn(duVar, lifecycleAware, aaVar, aVar4, dVar, fVar2);
            this.f194741h = cnVar;
            this.f194742i.i = cnVar;
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.support.v4.app.Fragment, com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.cq] */
    public final void onActivityResult(int i, int i2, Intent intent) {
        C91096f fVar = (C91096f) this.f194739e.get(i);
        if (fVar != null) {
            fVar.mo17703hg(i2, intent, getContext());
        }
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.cq.onCreate(android.os.Bundle):void, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void onCreate(android.os.Bundle r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.cq.onCreate(android.os.Bundle):void, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.settings.p5781hq.agentdirectory.C73608cq.onCreate(android.os.Bundle):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.cq.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final android.view.View onCreateView(android.view.LayoutInflater r1, android.view.ViewGroup r2, android.os.Bundle r3) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.cq.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.settings.p5781hq.agentdirectory.C73608cq.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroy() {
        C73608cq.super.onDestroy();
        this.f194741h.b.mo65162a();
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.cq.onResume():void, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void onResume() {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.cq.onResume():void, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.settings.p5781hq.agentdirectory.C73608cq.onResume():void");
    }
}
