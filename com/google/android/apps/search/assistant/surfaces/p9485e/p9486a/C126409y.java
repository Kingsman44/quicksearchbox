package com.google.android.apps.search.assistant.surfaces.p9485e.p9486a;

import com.google.android.libraries.search.p2904c.C37362b;
import com.google.android.libraries.search.p2904c.C37680i;
import com.google.android.libraries.search.p2904c.C37776k;
import com.google.android.libraries.search.p2904c.C37819l;
import com.google.android.libraries.search.p2904c.C38160x;
import com.google.android.libraries.search.p2904c.C38284z;
import com.google.protobuf.C63088z;
import java.util.concurrent.Executor;
import kotlinx.coroutines.p5574b.C71547cx;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.e.a.y */
/* compiled from: PG */
public final class C126409y implements C37362b {

    /* renamed from: a */
    private final C71547cx f348160a;

    /* renamed from: b */
    private final Executor f348161b;

    public C126409y(C71547cx cxVar, Executor executor) {
        C69664n.m101061g(executor, "executor");
        this.f348160a = cxVar;
        this.f348161b = executor;
    }

    /* renamed from: b */
    public final void mo39010b(C37819l lVar) {
        C37680i iVar;
        C38160x xVar;
        C69664n.m101061g(lVar, "audioData");
        int a = C37776k.m66678a(lVar.f100343b);
        int i = a - 1;
        C38284z zVar = C38284z.UNSET_END_OF_DATA_STATUS;
        if (a == 0) {
            throw null;
        } else if (i == 0) {
            C71547cx cxVar = this.f348160a;
            if (lVar.f100343b == 1) {
                iVar = (C37680i) lVar.f100344c;
            } else {
                iVar = C37680i.f100071c;
            }
            C63088z zVar2 = iVar.f100074b;
            C69664n.m101060f(zVar2, "audioData.audio.bytes");
            if (!cxVar.mo62806d(zVar2)) {
                throw new IllegalStateException("Check failed.");
            }
        } else if (i == 1) {
            if (lVar.f100343b == 2) {
                xVar = (C38160x) lVar.f100344c;
            } else {
                xVar = C38160x.f101118c;
            }
            C38284z a2 = C38284z.m67597a(xVar.f101121b);
            if (a2 == null) {
                a2 = C38284z.UNSET_END_OF_DATA_STATUS;
            }
            if (C126408x.f348159a[a2.ordinal()] == 1) {
                C71547cx cxVar2 = this.f348160a;
                C63088z zVar3 = C63088z.f170246b;
                C69664n.m101060f(zVar3, "EMPTY");
                if (!cxVar2.mo62806d(zVar3)) {
                    throw new IllegalStateException("Check failed.");
                }
                return;
            }
            throw C126372a.f348070a;
        }
    }

    /* renamed from: k */
    public final Executor mo39011k() {
        return this.f348161b;
    }
}
