package com.google.android.apps.gsa.speech.hotword.enrollmentutils;

import android.accounts.Account;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.shared.util.p7159c.C90880an;
import com.google.common.p4526f.C59052c;
import com.google.speech.p5208h.C66595bu;
import com.google.speech.p5208h.p5209a.C66535f;
import com.google.speech.p5208h.p5209a.C66540k;
import com.google.speech.p5224k.p5225a.C67242t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.speech.hotword.enrollmentutils.g */
/* compiled from: PG */
final class C92401g extends C90880an {

    /* renamed from: a */
    final /* synthetic */ String f257673a;

    /* renamed from: b */
    final /* synthetic */ Account f257674b;

    /* renamed from: c */
    final /* synthetic */ C66595bu f257675c;

    /* renamed from: d */
    final /* synthetic */ C90584f f257676d;

    /* renamed from: e */
    final /* synthetic */ C92399e f257677e;

    /* renamed from: f */
    final /* synthetic */ boolean f257678f;

    /* renamed from: g */
    final /* synthetic */ C92403i f257679g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92401g(C92403i iVar, String str, Account account, C66595bu buVar, C90584f fVar, C92399e eVar, boolean z) {
        super("sendEnrolmentFetcherRequestTask", 1, 12);
        this.f257679g = iVar;
        this.f257673a = str;
        this.f257674b = account;
        this.f257675c = buVar;
        this.f257676d = fVar;
        this.f257677e = eVar;
        this.f257678f = z;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        try {
            C92403i iVar = this.f257679g;
            boolean z = true;
            C66540k f = iVar.mo87048f(this.f257673a, this.f257674b, this.f257675c, true);
            C92399e eVar = this.f257677e;
            C90584f fVar = this.f257676d;
            boolean z2 = this.f257678f;
            ((C59052c) ((C59052c) C92403i.f257687a.mo56224b()).mo56372aa(12504)).mo56354G("downloadUtterances fetchType-%s modelType-%s", eVar, fVar);
            HashMap hashMap = new HashMap();
            int e = C92403i.m151725e(fVar, iVar.mo87047c(f, eVar), iVar.f257688b);
            if (f == null || e == 1) {
                z = z2;
            } else if (!z2 || e == 4) {
                ArrayList arrayList = new ArrayList();
                if (eVar == C92399e.NEW_UTTERANCES) {
                    for (C66535f fVar2 : f.f180974b) {
                        if (fVar2.f180957c <= 180) {
                            arrayList.add(fVar2);
                        } else {
                            ((C59052c) ((C59052c) C92403i.f257687a.mo56224b()).mo56372aa(12507)).mo56386p("The request is for fresh user enrollment utterances, do not count older utterances");
                        }
                    }
                } else {
                    arrayList.addAll(f.f180974b);
                }
                if (arrayList.size() > 4) {
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        C66535f fVar3 = (C66535f) arrayList.get(i);
                        if (C92403i.m151724d(C67242t.m97443a(fVar3.f180958d)) == 4) {
                            arrayList2.add(fVar3);
                        }
                    }
                    if (arrayList2.size() >= 4) {
                        ((C59052c) ((C59052c) C92403i.f257687a.mo56224b()).mo56372aa(12503)).mo56393w("Fetched %d utterances from server, but this was filtered to %d TISID utterances", arrayList.size(), arrayList2.size());
                        arrayList = arrayList2;
                    } else {
                        ((C59052c) ((C59052c) C92403i.f257687a.mo56226d()).mo56372aa(12502)).mo56386p("Unable to filter utterances, not enough TISID utterances fetched.");
                    }
                }
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C66535f fVar4 = (C66535f) arrayList.get(i2);
                    ((C59052c) ((C59052c) C92403i.f257687a.mo56224b()).mo56372aa(12506)).mo56359L("downloading utterances Id-%s, Age-%d Preamble Type-%d", fVar4.f180955a, Long.valueOf(fVar4.f180957c), Integer.valueOf(fVar4.f180958d));
                    Integer valueOf = Integer.valueOf(C92403i.m151724d(C67242t.m97443a(fVar4.f180958d)) - 1);
                    List list = (List) hashMap.get(valueOf);
                    if (list == null) {
                        list = new ArrayList();
                    }
                    list.add(fVar4.f180956b.mo59174N());
                    hashMap.put(valueOf, list);
                }
                return hashMap;
            }
            ((C59052c) ((C59052c) C92403i.f257687a.mo56225c()).mo56372aa(12505)).mo56389s("No utterances downloaded [isTiSidEnrollment-%b]", Boolean.valueOf(z));
            return hashMap;
        } catch (IOException unused) {
            return new HashMap();
        }
    }
}
