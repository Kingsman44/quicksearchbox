package com.google.android.libraries.search.p2904c.p2939k.p2940a;

import com.google.android.libraries.search.p2904c.C37362b;
import com.google.android.libraries.search.p2904c.C37400be;
import com.google.android.libraries.search.p2904c.C37422c;
import com.google.android.libraries.search.p2904c.C37519dz;
import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.android.libraries.search.p2904c.C37563ed;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.search.c.k.a.a */
/* compiled from: PG */
final class C37777a implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C37362b f100248a;

    public C37777a(C37362b bVar) {
        this.f100248a = bVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C37794b.f100288a.mo56226d()).mo56382g(th)).mo56372aa(52789)).mo56386p("#audio# Failed to get StartListeningResult.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        String str;
        C37563ed edVar;
        C37400be beVar = (C37400be) obj;
        if (beVar.mo40931c().mo56113h()) {
            C46459k.m82829b(((C37422c) beVar.mo40931c().mo56107c()).mo40946j(this.f100248a), "Failed to register AudioBytesReceiver.", new Object[0]);
            return;
        }
        C37561eb ebVar = beVar.mo40929a().f99350b;
        if (ebVar == null) {
            ebVar = C37561eb.f99800c;
        }
        C59052c cVar = (C59052c) ((C59052c) C37794b.f100288a.mo56226d()).mo56372aa(52790);
        int i = ebVar.f99802a;
        if (i == 2) {
            C37519dz a = C37519dz.m66524a(((Integer) ebVar.f99803b).intValue());
            if (a == null) {
                a = C37519dz.UNKNOWN_OPENING_FAILURE;
            }
            str = a.name();
        } else {
            if (i == 1) {
                edVar = C37563ed.m66571a(((Integer) ebVar.f99803b).intValue());
                if (edVar == null) {
                    edVar = C37563ed.UNKNOWN_OPENING_SUCCESS;
                }
            } else {
                edVar = C37563ed.UNKNOWN_OPENING_SUCCESS;
            }
            str = edVar.name();
        }
        cVar.mo56389s("#audio# registerAudioBytesReceiver AudioBytesReceiverRegistry absent, opening status: %s", str);
    }
}
