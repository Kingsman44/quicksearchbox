package com.google.android.libraries.social.populous.storage;

import android.os.CancellationSignal;
import androidx.p182p.C3925ah;
import androidx.p182p.C3929al;
import androidx.p182p.C3930am;
import androidx.p182p.C3933ap;
import androidx.p182p.C3966s;
import androidx.p182p.p183a.C3917e;
import androidx.p182p.p185c.C3943e;
import androidx.p186q.p187a.C4057l;
import com.google.common.util.concurrent.C60870cx;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import p5462h.p5463a.C69540x;
import p5462h.p5463a.p5464a.C69469c;

/* renamed from: com.google.android.libraries.social.populous.storage.bh */
/* compiled from: PG */
public final class C42634bh extends C42622aw {

    /* renamed from: a */
    public final C3925ah f111844a;

    /* renamed from: b */
    private final C3966s f111845b;

    /* renamed from: c */
    private final C3933ap f111846c;

    public C42634bh(C3925ah ahVar) {
        this.f111844a = ahVar;
        this.f111845b = new C42624ay(ahVar);
        this.f111846c = new C42625az(ahVar);
    }

    /* renamed from: i */
    public final List mo45743i(List list) {
        C3966s sVar;
        C4057l d;
        this.f111844a.mo8175S();
        this.f111844a.mo8181p();
        try {
            sVar = this.f111845b;
            d = sVar.mo8212d();
            C69469c cVar = new C69469c(10);
            for (Object a : list) {
                sVar.mo8306a(d, a);
                cVar.add(Long.valueOf(d.mo8257b()));
            }
            List a2 = C69540x.m100943a(cVar);
            sVar.mo8215g(d);
            this.f111844a.mo8188w();
            this.f111844a.mo8183r();
            return a2;
        } catch (Throwable th) {
            this.f111844a.mo8183r();
            throw th;
        }
    }

    /* renamed from: j */
    public final void mo45744j() {
        this.f111844a.mo8175S();
        C4057l d = this.f111846c.mo8212d();
        this.f111844a.mo8181p();
        try {
            d.mo8256a();
            this.f111844a.mo8188w();
        } finally {
            this.f111844a.mo8183r();
            this.f111846c.mo8215g(d);
        }
    }

    /* renamed from: k */
    public final C60870cx mo45727k(String str, Set set, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT   c.id AS contact_id,   c.affinity AS contact_affinity,   c.type AS contact_type,   c.proto_bytes AS contact_proto_bytes,   t.contact_id AS token_contact_id,   t.value AS token_value,   MAX(t.affinity) AS token_affinity,   t.field_type AS token_field_type FROM   Contacts c   INNER JOIN   Tokens t ON t.contact_id = c.id WHERE   t.value MATCH ?   AND   t.field_type IN (");
        int size = set.size();
        C3943e.m11297a(sb, size);
        sb.append(") GROUP BY   c.id ORDER BY   contact_affinity DESC,   token_affinity DESC LIMIT   ?");
        String sb2 = sb.toString();
        int i2 = 2;
        int i3 = size + 2;
        TreeMap treeMap = C3930am.f12576a;
        C3930am a = C3929al.m11267a(sb2, i3);
        a.mo8206g(1, str);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str2 == null) {
                a.f12582g[i2] = 1;
            } else {
                a.mo8206g(i2, str2);
            }
            i2++;
        }
        a.mo8204e(i3, (long) i);
        CancellationSignal cancellationSignal = new CancellationSignal();
        return C3917e.m11217b(this.f111844a, new C42630bd(this, a, cancellationSignal), a, cancellationSignal);
    }

    /* renamed from: l */
    public final C60870cx mo45728l(String str, Set set, Set set2, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT   c.id AS contact_id,   c.affinity AS contact_affinity,   c.type AS contact_type,   c.proto_bytes AS contact_proto_bytes,   t.contact_id AS token_contact_id,   t.value AS token_value,   MAX(t.affinity) AS token_affinity,   t.field_type AS token_field_type FROM   Contacts c   INNER JOIN   Tokens t ON t.contact_id = c.id WHERE   t.value MATCH ?   AND   c.type IN (");
        int size = set.size();
        C3943e.m11297a(sb, size);
        sb.append(")   AND   t.field_type IN (");
        int size2 = set2.size();
        C3943e.m11297a(sb, size2);
        sb.append(") GROUP BY   c.id ORDER BY   contact_affinity DESC,   token_affinity DESC LIMIT   ?");
        String sb2 = sb.toString();
        int i2 = 2;
        int i3 = size + 2;
        int i4 = size2 + i3;
        TreeMap treeMap = C3930am.f12576a;
        C3930am a = C3929al.m11267a(sb2, i4);
        a.mo8206g(1, str);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str2 == null) {
                a.f12582g[i2] = 1;
            } else {
                a.mo8206g(i2, str2);
            }
            i2++;
        }
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            String str3 = (String) it2.next();
            if (str3 == null) {
                a.f12582g[i3] = 1;
            } else {
                a.mo8206g(i3, str3);
            }
            i3++;
        }
        a.mo8204e(i4, (long) i);
        CancellationSignal cancellationSignal = new CancellationSignal();
        return C3917e.m11217b(this.f111844a, new C42629bc(this, a, cancellationSignal), a, cancellationSignal);
    }

    /* renamed from: m */
    public final C60870cx mo45729m(String str, Set set, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT   c.id AS contact_id,   c.affinity AS contact_affinity,   c.type AS contact_type,   c.proto_bytes AS contact_proto_bytes,   t.contact_id AS token_contact_id,   t.value AS token_value,   MAX(t.affinity) AS token_affinity,   t.field_type AS token_field_type FROM   Contacts c   INNER JOIN   Tokens t ON t.contact_id = c.id WHERE   t.value MATCH ?   AND   t.field_type IN (");
        int size = set.size();
        C3943e.m11297a(sb, size);
        sb.append(") GROUP BY   c.id ORDER BY   token_affinity DESC,   contact_affinity DESC LIMIT   ?");
        String sb2 = sb.toString();
        int i2 = 2;
        int i3 = size + 2;
        TreeMap treeMap = C3930am.f12576a;
        C3930am a = C3929al.m11267a(sb2, i3);
        a.mo8206g(1, str);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str2 == null) {
                a.f12582g[i2] = 1;
            } else {
                a.mo8206g(i2, str2);
            }
            i2++;
        }
        a.mo8204e(i3, (long) i);
        CancellationSignal cancellationSignal = new CancellationSignal();
        return C3917e.m11217b(this.f111844a, new C42628bb(this, a, cancellationSignal), a, cancellationSignal);
    }

    /* renamed from: n */
    public final C60870cx mo45730n(String str, Set set, Set set2, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT   c.id AS contact_id,   c.affinity AS contact_affinity,   c.type AS contact_type,   c.proto_bytes AS contact_proto_bytes,   t.contact_id AS token_contact_id,   t.value AS token_value,   MAX(t.affinity) AS token_affinity,   t.field_type AS token_field_type FROM   Contacts c   INNER JOIN   Tokens t ON t.contact_id = c.id WHERE   t.value MATCH ?   AND   c.type IN (");
        int size = set.size();
        C3943e.m11297a(sb, size);
        sb.append(")   AND   t.field_type IN (");
        int size2 = set2.size();
        C3943e.m11297a(sb, size2);
        sb.append(") GROUP BY   c.id ORDER BY   token_affinity DESC,   contact_affinity DESC LIMIT   ?");
        String sb2 = sb.toString();
        int i2 = 2;
        int i3 = size + 2;
        int i4 = size2 + i3;
        TreeMap treeMap = C3930am.f12576a;
        C3930am a = C3929al.m11267a(sb2, i4);
        a.mo8206g(1, str);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str2 == null) {
                a.f12582g[i2] = 1;
            } else {
                a.mo8206g(i2, str2);
            }
            i2++;
        }
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            String str3 = (String) it2.next();
            if (str3 == null) {
                a.f12582g[i3] = 1;
            } else {
                a.mo8206g(i3, str3);
            }
            i3++;
        }
        a.mo8204e(i4, (long) i);
        CancellationSignal cancellationSignal = new CancellationSignal();
        return C3917e.m11217b(this.f111844a, new C42627ba(this, a, cancellationSignal), a, cancellationSignal);
    }

    /* renamed from: o */
    public final C60870cx mo45731o(Set set, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT   c.id AS contact_id,   c.affinity AS contact_affinity,   c.type AS contact_type,   c.proto_bytes AS contact_proto_bytes,   t.contact_id AS token_contact_id,   t.value AS token_value,   MAX(t.affinity) AS token_affinity,   t.field_type AS token_field_type FROM   Contacts c   INNER JOIN   Tokens t ON t.contact_id = c.id WHERE   t.field_type IN (");
        int size = set.size();
        C3943e.m11297a(sb, size);
        sb.append(") GROUP BY   c.id ORDER BY   contact_affinity DESC,   token_affinity DESC LIMIT   ?");
        String sb2 = sb.toString();
        int i2 = size + 1;
        TreeMap treeMap = C3930am.f12576a;
        C3930am a = C3929al.m11267a(sb2, i2);
        Iterator it = set.iterator();
        int i3 = 1;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str == null) {
                a.f12582g[i3] = 1;
            } else {
                a.mo8206g(i3, str);
            }
            i3++;
        }
        a.mo8204e(i2, (long) i);
        CancellationSignal cancellationSignal = new CancellationSignal();
        return C3917e.m11217b(this.f111844a, new C42623ax(this, a, cancellationSignal), a, cancellationSignal);
    }

    /* renamed from: p */
    public final C60870cx mo45732p(Set set, Set set2, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT   c.id AS contact_id,   c.affinity AS contact_affinity,   c.type AS contact_type,   c.proto_bytes AS contact_proto_bytes,   t.contact_id AS token_contact_id,   t.value AS token_value,   MAX(t.affinity) AS token_affinity,   t.field_type AS token_field_type FROM   Contacts c   INNER JOIN   Tokens t ON t.contact_id = c.id WHERE   c.type IN (");
        int size = set.size();
        C3943e.m11297a(sb, size);
        sb.append(")   AND   t.field_type IN (");
        int size2 = set2.size();
        C3943e.m11297a(sb, size2);
        sb.append(") GROUP BY   c.id ORDER BY   contact_affinity DESC,   token_affinity DESC LIMIT   ?");
        String sb2 = sb.toString();
        int i2 = size + 1;
        int i3 = size2 + i2;
        TreeMap treeMap = C3930am.f12576a;
        C3930am a = C3929al.m11267a(sb2, i3);
        Iterator it = set.iterator();
        int i4 = 1;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str == null) {
                a.f12582g[i4] = 1;
            } else {
                a.mo8206g(i4, str);
            }
            i4++;
        }
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            if (str2 == null) {
                a.f12582g[i2] = 1;
            } else {
                a.mo8206g(i2, str2);
            }
            i2++;
        }
        a.mo8204e(i3, (long) i);
        CancellationSignal cancellationSignal = new CancellationSignal();
        return C3917e.m11217b(this.f111844a, new C42633bg(this, a, cancellationSignal), a, cancellationSignal);
    }

    /* renamed from: q */
    public final C60870cx mo45733q(Set set, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT   c.id AS contact_id,   c.affinity AS contact_affinity,   c.type AS contact_type,   c.proto_bytes AS contact_proto_bytes,   t.contact_id AS token_contact_id,   t.value AS token_value,   MAX(t.affinity) AS token_affinity,   t.field_type AS token_field_type FROM   Contacts c   INNER JOIN   Tokens t ON t.contact_id = c.id WHERE   t.field_type IN (");
        int size = set.size();
        C3943e.m11297a(sb, size);
        sb.append(") GROUP BY   c.id ORDER BY   token_affinity DESC,   contact_affinity DESC LIMIT   ?");
        String sb2 = sb.toString();
        int i2 = size + 1;
        TreeMap treeMap = C3930am.f12576a;
        C3930am a = C3929al.m11267a(sb2, i2);
        Iterator it = set.iterator();
        int i3 = 1;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str == null) {
                a.f12582g[i3] = 1;
            } else {
                a.mo8206g(i3, str);
            }
            i3++;
        }
        a.mo8204e(i2, (long) i);
        CancellationSignal cancellationSignal = new CancellationSignal();
        return C3917e.m11217b(this.f111844a, new C42632bf(this, a, cancellationSignal), a, cancellationSignal);
    }

    /* renamed from: r */
    public final C60870cx mo45734r(Set set, Set set2, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT   c.id AS contact_id,   c.affinity AS contact_affinity,   c.type AS contact_type,   c.proto_bytes AS contact_proto_bytes,   t.contact_id AS token_contact_id,   t.value AS token_value,   MAX(t.affinity) AS token_affinity,   t.field_type AS token_field_type FROM   Contacts c   INNER JOIN   Tokens t ON t.contact_id = c.id WHERE   c.type IN (");
        int size = set.size();
        C3943e.m11297a(sb, size);
        sb.append(")   AND   t.field_type IN (");
        int size2 = set2.size();
        C3943e.m11297a(sb, size2);
        sb.append(") GROUP BY   c.id ORDER BY   token_affinity DESC,   contact_affinity DESC LIMIT   ?");
        String sb2 = sb.toString();
        int i2 = size + 1;
        int i3 = size2 + i2;
        TreeMap treeMap = C3930am.f12576a;
        C3930am a = C3929al.m11267a(sb2, i3);
        Iterator it = set.iterator();
        int i4 = 1;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str == null) {
                a.f12582g[i4] = 1;
            } else {
                a.mo8206g(i4, str);
            }
            i4++;
        }
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            if (str2 == null) {
                a.f12582g[i2] = 1;
            } else {
                a.mo8206g(i2, str2);
            }
            i2++;
        }
        a.mo8204e(i3, (long) i);
        CancellationSignal cancellationSignal = new CancellationSignal();
        return C3917e.m11217b(this.f111844a, new C42631be(this, a, cancellationSignal), a, cancellationSignal);
    }
}
