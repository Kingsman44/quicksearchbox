package com.google.android.libraries.p10923ac.p10925b.p10934e;

import android.accounts.Account;
import com.google.android.libraries.p10923ac.p10925b.p10927b.C146772b;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147055a;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147075at;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147085h;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147086i;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147088k;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147089l;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147095r;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147096s;
import com.google.android.libraries.p10923ac.p10925b.p10945l.C147179m;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m;
import com.google.common.p4541l.C59341x;
import com.google.common.util.concurrent.C60933u;
import com.google.protos.p4895aw.p4902b.C63978ao;
import com.google.protos.p4895aw.p4902b.C63998bh;
import dagger.C68214a;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: com.google.android.libraries.ac.b.e.bl */
/* compiled from: PG */
public final class C146909bl implements C146906bi {

    /* renamed from: c */
    private static final C147096s f396562c;

    /* renamed from: a */
    public final Map f396563a = new HashMap();

    /* renamed from: b */
    public final C60933u f396564b = C60933u.m93072c();

    /* renamed from: d */
    private final C68214a f396565d;

    /* renamed from: e */
    private final C68214a f396566e;

    /* renamed from: f */
    private final C147179m f396567f;

    /* renamed from: g */
    private final C147179m f396568g;

    /* renamed from: h */
    private final C147089l f396569h;

    /* renamed from: i */
    private final C68214a f396570i;

    static {
        HashSet hashSet = new HashSet();
        C147095r.m239832a(':', hashSet);
        f396562c = new C147096s('\\', hashSet);
    }

    public C146909bl(C68214a aVar, C68214a aVar2, C147179m mVar, C147179m mVar2, C147089l lVar, C68214a aVar3) {
        this.f396565d = aVar;
        this.f396566e = aVar2;
        this.f396567f = mVar;
        this.f396568g = mVar2;
        this.f396569h = lVar;
        this.f396570i = aVar3;
    }

    /* renamed from: a */
    public final C146907bj mo123794a(Account account, int i, int i2) {
        C146907bj bjVar;
        Account account2 = account;
        int i3 = i;
        int i4 = i2;
        C146772b bVar = new C146772b(account2, C146854ax.m239334d(i3, i4, C63978ao.SYNC_FULL_SNAPSHOT));
        C59341x a = C59341x.m92227a();
        synchronized (this.f396563a) {
            try {
                bjVar = (C146907bj) this.f396563a.get(bVar);
                if (bjVar == null) {
                    C147096s sVar = f396562c;
                    String a2 = sVar.mo123916a(account2.type);
                    String a3 = sVar.mo123916a(account2.name);
                    C147089l c = this.f396569h.mo123883c(a2 + ":" + a3 + ":" + i3 + ":" + i4);
                    a.mo56859c(c);
                    C68214a aVar = this.f396566e;
                    C147088k a4 = c.mo123881a("ts-data");
                    a.mo56859c(a4);
                    C147085h hVar = new C147085h(this.f396565d, ((Integer) this.f396567f.mo124004a()).intValue(), C63998bh.f173067f.getParserForType(), c.mo123881a("ts-changelog"));
                    a.mo56859c(hVar);
                    C147085h hVar2 = new C147085h(this.f396565d, ((Integer) this.f396567f.mo124004a()).intValue(), C63998bh.f173067f.getParserForType(), c.mo123881a("ts-synclog"));
                    a.mo56859c(hVar2);
                    C147055a aVar2 = new C147055a(new C147086i(c.mo123881a("ts-metadata")));
                    a.mo56859c(aVar2);
                    C146910bm bmVar = new C146910bm(aVar, bVar, a4, hVar, hVar2, aVar2, c, this.f396570i, this, ((Integer) this.f396568g.mo124004a()).intValue());
                    this.f396563a.put(bVar, bmVar);
                    bjVar = bmVar;
                }
                this.f396564b.mo57435a(bVar, 1);
            } catch (IOException e) {
                IOException iOException = e;
                try {
                    a.close();
                } catch (IOException e2) {
                    ((C147256m) this.f396566e.mo27525b()).mo124063f("Failure cleaning up erroneous creation of accessor object", e2, new Object[0]);
                }
                throw C147075at.m239771a(iOException);
            }
        }
        return bjVar;
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        synchronized (this.f396563a) {
            for (Map.Entry entry : this.f396563a.entrySet()) {
                ((C147256m) this.f396566e.mo27525b()).mo124067j("Channel %s was not closed. Closing it in finalizer.", entry.getKey());
                ((C146907bj) entry.getValue()).close();
            }
        }
        super.finalize();
    }
}
