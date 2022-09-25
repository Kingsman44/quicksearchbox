package com.google.android.apps.gsa.assistant.settings.shared.pronlearning;

import com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.service.C88499t;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.shared.pronlearning.g */
/* compiled from: PG */
final class C73773g extends C88499t {

    /* renamed from: a */
    final /* synthetic */ C73774h f195058a;

    public C73773g(C73774h hVar) {
        this.f195058a = hVar;
    }

    /* renamed from: f */
    public final void mo17567f(ParcelableVoiceAction parcelableVoiceAction) {
        C58976aa aaVar = C58975e.f156826a;
        SearchError searchError = (SearchError) parcelableVoiceAction.f236008a;
        C73774h hVar = this.f195058a;
        SearchError searchError2 = hVar.f195064f;
        if (searchError2 == null || !(searchError == null || searchError2.mo81135N() == searchError.mo81135N())) {
            hVar.f195064f = searchError;
            hVar.f195065g = true;
            hVar.mo65255b();
        }
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.shared.pronlearning.g.g(int):void, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    /* renamed from: g */
    public final void mo17568g(int r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.shared.pronlearning.g.g(int):void, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.settings.shared.pronlearning.C73773g.mo17568g(int):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.shared.pronlearning.g.iJ(com.google.android.apps.gsa.search.shared.service.ServiceEventData):void, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    /* renamed from: iJ */
    public final void mo17571iJ(com.google.android.apps.gsa.search.shared.service.ServiceEventData r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.shared.pronlearning.g.iJ(com.google.android.apps.gsa.search.shared.service.ServiceEventData):void, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.settings.shared.pronlearning.C73773g.mo17571iJ(com.google.android.apps.gsa.search.shared.service.ServiceEventData):void");
    }
}
