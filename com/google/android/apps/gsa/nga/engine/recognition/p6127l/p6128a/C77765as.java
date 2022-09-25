package com.google.android.apps.gsa.nga.engine.recognition.p6127l.p6128a;

import android.support.p033v7.widget.LinearLayoutManager;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.speech.p5218j.C66994hc;
import com.google.speech.p5218j.C66997hf;
import com.google.speech.p5218j.C66998hg;
import com.google.speech.p5218j.C66999hh;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.l.a.as */
/* compiled from: PG */
public final /* synthetic */ class C77765as implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C66999hh f214225a;

    public /* synthetic */ C77765as(C66999hh hhVar) {
        this.f214225a = hhVar;
    }

    public final C60870cx apply(Object obj) {
        C66999hh hhVar = this.f214225a;
        Optional optional = (Optional) obj;
        C58974d dVar = C77772az.f214232a;
        if (!optional.isPresent()) {
            ((C58970a) ((C58970a) C77772az.f214232a.mo56224b()).mo56372aa(4457)).mo56386p("No p13n resources from Sheldon.");
            return C60856cj.m92900i(hhVar);
        }
        ((C58970a) ((C58970a) C77772az.f214232a.mo56224b()).mo56372aa(4456)).mo56389s("Using the Sheldon personalized ASR resources: %s", optional.get());
        C66997hf hfVar = hhVar.f182132d;
        if (hfVar == null) {
            hfVar = C66997hf.f182099z;
        }
        C66994hc hcVar = (C66994hc) hfVar.toBuilder();
        String str = (String) optional.get();
        hcVar.copyOnWrite();
        C66997hf hfVar2 = (C66997hf) hcVar.instance;
        str.getClass();
        hfVar2.f182102a |= LinearLayoutManager.INVALID_OFFSET;
        hfVar2.f182124w = str;
        C66997hf hfVar3 = (C66997hf) hcVar.build();
        C66998hg hgVar = (C66998hg) hhVar.toBuilder();
        hgVar.copyOnWrite();
        C66999hh hhVar2 = (C66999hh) hgVar.instance;
        hfVar3.getClass();
        hhVar2.f182132d = hfVar3;
        hhVar2.f182129a |= 4;
        return C60856cj.m92900i((C66999hh) hgVar.build());
    }
}
