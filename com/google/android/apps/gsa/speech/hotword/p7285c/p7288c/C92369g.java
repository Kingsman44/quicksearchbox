package com.google.android.apps.gsa.speech.hotword.p7285c.p7288c;

import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.android.libraries.p579ar.sceneviewer.p589ui.SimpleSnackbar;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.C60590vn;
import com.google.common.p4552o.C60591vo;
import com.google.protos.p4816ai.p4818b.C63196b;
import com.google.speech.p5208h.C66624cv;

/* renamed from: com.google.android.apps.gsa.speech.hotword.c.c.g */
/* compiled from: PG */
public final class C92369g extends C90888av {

    /* renamed from: a */
    final /* synthetic */ C66624cv f257550a;

    /* renamed from: b */
    final /* synthetic */ C84516aa f257551b;

    /* renamed from: c */
    final /* synthetic */ boolean f257552c;

    /* renamed from: d */
    final /* synthetic */ boolean f257553d;

    /* renamed from: e */
    final /* synthetic */ int f257554e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92369g(C66624cv cvVar, C84516aa aaVar, boolean z, boolean z2, int i) {
        super("logDeviceSelectionEvent", 2, 16);
        this.f257550a = cvVar;
        this.f257551b = aaVar;
        this.f257552c = z;
        this.f257553d = z2;
        this.f257554e = i;
    }

    public final void run() {
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 818;
        C60590vn vnVar = (C60590vn) C60591vo.f164368h.createBuilder();
        boolean z = this.f257550a.f181251b;
        vnVar.copyOnWrite();
        C60591vo voVar = (C60591vo) vnVar.instance;
        voVar.f164370a |= 1;
        voVar.f164371b = z;
        boolean d = this.f257551b.mo78230d();
        vnVar.copyOnWrite();
        C60591vo voVar2 = (C60591vo) vnVar.instance;
        voVar2.f164370a |= 2;
        voVar2.f164372c = d;
        boolean z2 = this.f257552c;
        vnVar.copyOnWrite();
        C60591vo voVar3 = (C60591vo) vnVar.instance;
        voVar3.f164370a |= 4;
        voVar3.f164373d = z2;
        int i = true != this.f257553d ? 0 : SimpleSnackbar.LENGTH_SHORT;
        vnVar.copyOnWrite();
        C60591vo voVar4 = (C60591vo) vnVar.instance;
        voVar4.f164370a |= 8;
        voVar4.f164374e = i;
        vnVar.copyOnWrite();
        C60591vo voVar5 = (C60591vo) vnVar.instance;
        voVar5.f164370a |= 16;
        voVar5.f164375f = false;
        int i2 = this.f257554e;
        vnVar.copyOnWrite();
        C60591vo voVar6 = (C60591vo) vnVar.instance;
        voVar6.f164370a |= 64;
        voVar6.f164376g = i2;
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        C60591vo voVar7 = (C60591vo) vnVar.build();
        voVar7.getClass();
        ufVar2.f164179bg = voVar7;
        ufVar2.f164252g |= 16;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }
}
