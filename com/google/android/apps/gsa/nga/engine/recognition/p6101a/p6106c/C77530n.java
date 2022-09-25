package com.google.android.apps.gsa.nga.engine.recognition.p6101a.p6106c;

import android.os.Build;
import com.google.android.apps.gsa.nga.engine.recognition.C77566as;
import com.google.android.apps.gsa.nga.engine.recognition.C77568au;
import com.google.android.apps.gsa.nga.shared.p6305ae.p6306a.C80561f;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82315aq;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82544jc;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82545jd;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82777aa;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82778ab;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.search.p2904c.C37418bw;
import com.google.android.libraries.search.p2904c.C37512ds;
import com.google.android.libraries.search.p2904c.C37514du;
import com.google.android.libraries.search.p2904c.C37516dw;
import com.google.common.base.C58835az;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.a.c.n */
/* compiled from: PG */
public final /* synthetic */ class C77530n implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C77534r f213606a;

    /* renamed from: b */
    public final /* synthetic */ C77566as f213607b;

    /* renamed from: c */
    public final /* synthetic */ C80561f f213608c;

    public /* synthetic */ C77530n(C77534r rVar, C77566as asVar, C80561f fVar) {
        this.f213606a = rVar;
        this.f213607b = asVar;
        this.f213608c = fVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        String str;
        C37512ds dsVar;
        C37512ds dsVar2;
        C37516dw dwVar;
        C77534r rVar = this.f213606a;
        C77566as asVar = this.f213607b;
        C80561f fVar = this.f213608c;
        C37514du duVar = ((C37418bw) obj).f99354b;
        if (duVar == null) {
            duVar = C37514du.f99629c;
        }
        if (duVar.f99631a == 1) {
            rVar.f213617c.mo74271b(C89849ae.NGA_SPEECH_HANDLER_MIC_CLOSED);
            rVar.f213623i.mo75090a(asVar.mo72691n());
            C58970a aVar = (C58970a) ((C58970a) C77534r.f213615a.mo56224b()).mo56372aa(4289);
            int i = fVar.f221127b;
            if (duVar.f99631a == 1) {
                dwVar = C37516dw.m66521a(((Integer) duVar.f99632b).intValue());
                if (dwVar == null) {
                    dwVar = C37516dw.UNKNOWN_CLOSING_SUCCESS;
                }
            } else {
                dwVar = C37516dw.UNKNOWN_CLOSING_SUCCESS;
            }
            aVar.mo56395y("Microphone(id=%d) closed with status: %s", i, dwVar.name());
        } else {
            rVar.f213618d.mo72746b(asVar);
            C58970a aVar2 = (C58970a) ((C58970a) C77534r.f213615a.mo56224b()).mo56372aa(4288);
            int i2 = fVar.f221127b;
            if (duVar.f99631a == 2) {
                dsVar2 = C37512ds.m66519a(((Integer) duVar.f99632b).intValue());
                if (dsVar2 == null) {
                    dsVar2 = C37512ds.UNKNOWN_CLOSING_FAILURE;
                }
            } else {
                dsVar2 = C37512ds.UNKNOWN_CLOSING_FAILURE;
            }
            aVar2.mo56395y("Microphone(id=%d) didn't close successfully with status: %s", i2, dsVar2.name());
        }
        rVar.f213626l.mo75090a(new C58835az(fVar, duVar));
        C77509a aVar3 = rVar.f213619e;
        int m = asVar.mo72690m();
        int i3 = duVar.f99631a;
        if (i3 == 1) {
            C37516dw a = C37516dw.m66521a(((Integer) duVar.f99632b).intValue());
            if (a == null) {
                a = C37516dw.UNKNOWN_CLOSING_SUCCESS;
            }
            str = a.name();
        } else {
            if (i3 == 2) {
                dsVar = C37512ds.m66519a(((Integer) duVar.f99632b).intValue());
                if (dsVar == null) {
                    dsVar = C37512ds.UNKNOWN_CLOSING_FAILURE;
                }
            } else {
                dsVar = C37512ds.UNKNOWN_CLOSING_FAILURE;
            }
            str = dsVar.name();
        }
        C83305i iVar = aVar3.f213571a;
        C82544jc j = C82545jd.m131436j();
        C82315aq aqVar = (C82315aq) j;
        aqVar.f224852b = "CLOSE";
        j.mo75665e(str);
        String a2 = C77568au.m124486a(m);
        if (m != 0) {
            aqVar.f224853c = a2;
            j.mo75664d(aVar3.f213573c.mo72021b().mo72042g());
            j.mo75663c();
            j.mo75662b(Build.VERSION.SDK_INT);
            iVar.mo75579d(j.mo75661a());
            C83334w wVar = aVar3.f213572b;
            C82887ec ecVar = C82887ec.AUDIO_LIBRARY_MIC_EVENT;
            C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
            C82777aa aaVar = (C82777aa) C82778ab.f225544e.createBuilder();
            aaVar.copyOnWrite();
            C82778ab abVar = (C82778ab) aaVar.instance;
            duVar.getClass();
            abVar.f225547b = duVar;
            abVar.f225546a |= 1;
            aaVar.copyOnWrite();
            C82778ab abVar2 = (C82778ab) aaVar.instance;
            abVar2.f225548c = m;
            abVar2.f225546a |= 2;
            aaVar.copyOnWrite();
            C82778ab abVar3 = (C82778ab) aaVar.instance;
            abVar3.f225546a |= 4;
            abVar3.f225549d = false;
            C82778ab abVar4 = (C82778ab) aaVar.build();
            dzVar.copyOnWrite();
            C82885ea eaVar = (C82885ea) dzVar.instance;
            abVar4.getClass();
            eaVar.f225980b = abVar4;
            eaVar.f225979a = 80;
            wVar.mo75543a(ecVar, (C82885ea) dzVar.build());
            return;
        }
        throw null;
    }
}
