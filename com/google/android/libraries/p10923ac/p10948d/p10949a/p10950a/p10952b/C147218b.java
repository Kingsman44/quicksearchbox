package com.google.android.libraries.p10923ac.p10948d.p10949a.p10950a.p10952b;

import android.accounts.Account;
import com.google.android.gms.mdh.internal.C145033a;
import com.google.android.gms.mdh.internal.C145050aq;
import com.google.android.gms.mdh.internal.C145060k;
import com.google.android.libraries.gcoreclient.p1794s.p1795a.C21636a;
import com.google.android.libraries.gcoreclient.p1794s.p1795a.C21640e;
import com.google.android.libraries.gcoreclient.p1794s.p1795a.C21652q;
import com.google.android.libraries.p10923ac.p10947c.C147202d;
import com.google.android.libraries.p10923ac.p10947c.C147205g;
import com.google.android.libraries.p10923ac.p10947c.C147209k;
import com.google.android.libraries.p10923ac.p10948d.p10949a.p10950a.p10951a.C147212b;
import com.google.protobuf.C62917ay;
import com.google.protobuf.C62940bt;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.ac.d.a.a.b.b */
/* compiled from: PG */
public final class C147218b implements C147202d {

    /* renamed from: a */
    private final C147217a f397435a = new C147217a();

    /* renamed from: b */
    private final C147212b f397436b = new C147212b();

    /* renamed from: c */
    private final Executor f397437c;

    /* renamed from: d */
    private final C21636a f397438d;

    public C147218b(C21636a aVar, Executor executor) {
        this.f397438d = aVar;
        this.f397437c = executor;
    }

    /* renamed from: a */
    public final C147205g mo124029a(Account account, int i, C62917ay ayVar) {
        int i2 = ((C62940bt) ayVar).f169971d.f169964b;
        C145033a aVar = this.f397438d.f59990a;
        return new C147221e(this.f397437c, new C21640e(new C145060k(aVar.f392055a, aVar.f392057c, account, i, i2)), ayVar);
    }

    /* renamed from: b */
    public final C147209k mo124030b(Account account, int i, C62917ay ayVar) {
        int i2 = ((C62940bt) ayVar).f169971d.f169964b;
        C145033a aVar = this.f397438d.f59990a;
        return new C147222f(this.f397437c, new C21652q(new C145050aq(aVar.f392055a, aVar.f392056b, aVar.f392057c, aVar.f392058d, account, i, i2)), ayVar);
    }
}
