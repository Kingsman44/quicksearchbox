package com.google.apps.tiktok.cache;

import android.content.ContentValues;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.p3315b.C42827am;
import com.google.android.libraries.storage.p3315b.C42828an;
import com.google.android.libraries.storage.p3315b.C42829ao;
import com.google.android.libraries.storage.p3315b.C42832ar;
import com.google.android.libraries.storage.p3315b.C42839ay;
import com.google.android.libraries.storage.p3315b.C42840az;
import com.google.android.libraries.storage.p3315b.C42847bf;
import com.google.android.libraries.storage.p3315b.C42850e;
import com.google.apps.tiktok.p3648i.p3649a.C47153d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58817ah;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.protobuf.C62921ba;
import com.google.protobuf.MessageLite;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.apps.tiktok.cache.aw */
/* compiled from: PG */
public final class C46385aw implements C46407v {

    /* renamed from: a */
    public final C62921ba f121410a;

    /* renamed from: b */
    public final C60887da f121411b;

    /* renamed from: c */
    public final C42850e f121412c;

    /* renamed from: d */
    public final C21370a f121413d;

    /* renamed from: e */
    public final MessageLite f121414e;

    /* renamed from: f */
    public final long f121415f;

    /* renamed from: g */
    public final boolean f121416g;

    public C46385aw(C46361a aVar, String str, int i, C21370a aVar2, C62921ba baVar, C60887da daVar, C46409x xVar) {
        this.f121413d = aVar2;
        this.f121410a = baVar;
        this.f121411b = daVar;
        MessageLite d = xVar.mo50365d();
        C58838bb.m90866a(d, "Must provide a non-null default instance of the value proto");
        this.f121414e = d;
        boolean z = false;
        this.f121416g = i > 0;
        long millis = TimeUnit.DAYS.toMillis((long) i);
        long c = xVar.mo50364c();
        C58838bb.m90869d((millis < 0 || c < 0 || millis > c) ? true : z, "If expireAfterWriteDays and filterAfterWrite are both set, filterAfterWrite must be a shorter duration");
        if (c > 0) {
            this.f121415f = c;
        } else if (millis > 0) {
            this.f121415f = millis;
        } else {
            this.f121415f = -1;
        }
        C42832ar arVar = new C42832ar("evict_full_cache_trigger");
        arVar.f112116a.append("AFTER INSERT ON cache_table");
        m82685m(arVar, xVar);
        C42832ar arVar2 = new C42832ar("recursive_eviction_trigger");
        arVar2.f112116a.append("AFTER DELETE ON cache_table");
        m82685m(arVar2, xVar);
        C42829ao aoVar = new C42829ao();
        C42828an.m75678a("recursive_triggers = 1", aoVar);
        C42828an.m75678a("synchronous = 0", aoVar);
        C42827am amVar = new C42827am();
        amVar.mo45915b("CREATE TABLE cache_table(request_data BLOB PRIMARY KEY, response_data BLOB NOT NULL, write_ms INTEGER NOT NULL, access_ms INTEGER NOT NULL)");
        amVar.mo45915b("ALTER TABLE cache_table ADD COLUMN invalid_flag INTEGER NOT NULL DEFAULT 0");
        amVar.mo45915b("DELETE FROM cache_table WHERE LENGTH(response_data) >= 2000000");
        amVar.f112108a.mo55395g(C46375am.f121394a);
        amVar.mo45915b("CREATE INDEX access ON cache_table(access_ms)");
        amVar.f112109b.mo55395g(arVar.mo45918a());
        amVar.f112109b.mo55395g(arVar2.mo45918a());
        amVar.f112110c = aoVar;
        this.f121412c = aVar.f121369a.mo50196b(str, amVar.mo45914a(), C47153d.m83864c(xVar.mo50366e()));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    /* renamed from: j */
    public static final void m82682j(C42847bf bfVar, MessageLite messageLite, C46370ah ahVar, long j) {
        byte[] byteArray = ahVar.f121384a.toByteArray();
        int length = byteArray.length;
        C58838bb.m90871f(length < 2000000, "Message exceeds 2MB limit. Was %s bytes", length);
        ContentValues contentValues = new ContentValues(5);
        contentValues.put("request_data", messageLite.toByteArray());
        contentValues.put("response_data", byteArray);
        contentValues.put("write_ms", Long.valueOf(ahVar.f121385b));
        contentValues.put("access_ms", Long.valueOf(j));
        bfVar.mo45931c("cache_table", contentValues, 5);
    }

    /* renamed from: k */
    public static void m82683k(C42840az azVar, String str) {
        azVar.f112130a.append("'");
        azVar.f112130a.append(str);
        azVar.f112130a.append("'");
    }

    /* renamed from: l */
    private static final void m82684l(C42832ar arVar, C46409x xVar) {
        arVar.f112116a.append("(SELECT COUNT(*) > ");
        arVar.f112116a.append(xVar.mo50362a());
        arVar.f112116a.append(" FROM cache_table) ");
    }

    /* renamed from: m */
    private static final void m82685m(C42832ar arVar, C46409x xVar) {
        arVar.f112116a.append(" WHEN (");
        if (xVar.mo50363b() > 0) {
            if (xVar.mo50362a() > 0) {
                m82684l(arVar, xVar);
                arVar.f112116a.append(" OR ");
            }
            arVar.f112116a.append("(SELECT SUM(LENGTH(request_data) + LENGTH(response_data)) > ");
            arVar.f112116a.append(xVar.mo50363b());
            arVar.f112116a.append(" AND COUNT(*) > 1 FROM cache_table) ");
        } else {
            m82684l(arVar, xVar);
        }
        arVar.f112116a.append(") BEGIN DELETE FROM cache_table WHERE rowid=(SELECT rowid FROM cache_table ORDER BY access_ms LIMIT 1); END");
    }

    /* renamed from: a */
    public final ContentValues mo50341a(MessageLite messageLite, MessageLite messageLite2) {
        C58838bb.m90866a(messageLite2, "Cannot cache a null value");
        long b = this.f121413d.mo26870b();
        byte[] byteArray = messageLite2.toByteArray();
        ContentValues contentValues = new ContentValues(5);
        int length = byteArray.length;
        C58838bb.m90871f(length < 2000000, "Message exceeds 2MB limit. Was %s bytes", length);
        contentValues.put("request_data", messageLite.toByteArray());
        contentValues.put("response_data", byteArray);
        Long valueOf = Long.valueOf(b);
        contentValues.put("write_ms", valueOf);
        contentValues.put("access_ms", valueOf);
        return contentValues;
    }

    /* renamed from: b */
    public final C60870cx mo50342b(MessageLite messageLite) {
        return this.f121412c.mo45938b(new C46381as(messageLite));
    }

    /* renamed from: c */
    public final C60870cx mo50343c() {
        return this.f121412c.mo45938b(C46377ao.f121397a);
    }

    /* renamed from: d */
    public final C60870cx mo50344d(MessageLite messageLite, C60870cx cxVar) {
        C58838bb.m90866a(messageLite, "Cannot write to cache with a null key");
        return C47633f.m84733g(cxVar).mo51516i(new C46384av(this, messageLite), this.f121411b);
    }

    /* renamed from: e */
    public final C60870cx mo50345e(MessageLite messageLite) {
        return this.f121412c.mo45937a(new C46374al(this, messageLite));
    }

    /* renamed from: f */
    public final C60870cx mo50346f(MessageLite messageLite, C60870cx cxVar) {
        C58838bb.m90866a(messageLite, "Cannot write to cache with a null key");
        return C47633f.m84733g(cxVar).mo51516i(new C46376an(this, messageLite), C60826bg.f164896a);
    }

    /* renamed from: g */
    public final C60870cx mo50347g(Map map) {
        return C60856cj.m92894c(map.values()).mo57335b(C47810es.m84965e(new C46378ap(this, map)), C60826bg.f164896a);
    }

    /* renamed from: i */
    public final C42839ay mo50349i(MessageLite messageLite) {
        C42840az azVar = new C42840az();
        azVar.f112130a.append("SELECT response_data, write_ms FROM cache_table WHERE request_data=?");
        azVar.f112131b.add(messageLite.toByteArray());
        if (this.f121415f > 0) {
            azVar.f112130a.append(" AND write_ms>=?");
            azVar.f112131b.add(Long.valueOf(this.f121413d.mo26870b() - this.f121415f));
        }
        return azVar.mo45920a();
    }

    /* renamed from: h */
    public final C60870cx mo50348h(MessageLite messageLite, C58817ah ahVar) {
        messageLite.getClass();
        return this.f121412c.mo45937a(new C46380ar(this, messageLite, ahVar));
    }
}
