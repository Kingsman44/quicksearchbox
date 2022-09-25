package com.google.android.apps.gsa.staticplugins.accl.performers;

import com.google.android.apps.gsa.search.shared.api.C87504b;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.C63088z;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.bh */
/* compiled from: PG */
public final /* synthetic */ class C92904bh implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C92915bs f259182a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f259183b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f259184c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f259185d;

    /* renamed from: e */
    public final /* synthetic */ String f259186e;

    public /* synthetic */ C92904bh(C92915bs bsVar, AccountId accountId, C60870cx cxVar, C60870cx cxVar2, String str) {
        this.f259182a = bsVar;
        this.f259183b = accountId;
        this.f259184c = cxVar;
        this.f259185d = cxVar2;
        this.f259186e = str;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C92915bs bsVar = this.f259182a;
        AccountId accountId = this.f259183b;
        C60870cx cxVar = this.f259184c;
        C60870cx cxVar2 = this.f259185d;
        String str = this.f259186e;
        C70862aj e = bsVar.mo87479e(accountId);
        C58833ax axVar = (C58833ax) C60856cj.m92909r(cxVar);
        C58833ax axVar2 = (C58833ax) C60856cj.m92909r(cxVar2);
        if (axVar.mo56113h()) {
            e.mo20123c(bsVar.mo87477b(str, axVar2));
            InputStream b = ((C87504b) axVar.mo56107c()).mo81512b();
            byte[] bArr = new byte[4096];
            while (true) {
                try {
                    int read = b.read(bArr);
                    if (read == -1) {
                        break;
                    } else if (read < 4096) {
                        e.mo20123c(C92915bs.m152965c(C63088z.m96139A(Arrays.copyOf(bArr, read))));
                    } else {
                        e.mo20123c(C92915bs.m152965c(C63088z.m96139A(bArr)));
                    }
                } catch (IOException e2) {
                    e.mo20122b(e2);
                }
            }
            e.mo20121a();
        }
        return C92915bs.f62144n;
    }
}
