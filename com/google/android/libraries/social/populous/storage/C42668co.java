package com.google.android.libraries.social.populous.storage;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.p182p.C3925ah;
import androidx.p182p.C3929al;
import androidx.p182p.C3930am;
import androidx.p182p.C3933ap;
import androidx.p182p.C3965r;
import androidx.p182p.C3966s;
import androidx.p182p.p185c.C3939a;
import androidx.p182p.p185c.C3940b;
import androidx.p182p.p185c.C3943e;
import androidx.p186q.p187a.C4057l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/* renamed from: com.google.android.libraries.social.populous.storage.co */
/* compiled from: PG */
public final class C42668co extends C42662ci {

    /* renamed from: a */
    private final C3925ah f111867a;

    /* renamed from: b */
    private final C3966s f111868b;

    /* renamed from: c */
    private final C3965r f111869c;

    /* renamed from: d */
    private final C3933ap f111870d;

    public C42668co(C3925ah ahVar) {
        this.f111867a = ahVar;
        this.f111868b = new C42663cj(ahVar);
        this.f111869c = new C42664ck(ahVar);
        this.f111870d = new C42665cl(ahVar);
        new C42666cm(ahVar);
        new C42667cn(ahVar);
    }

    /* renamed from: a */
    public final void mo45761a(int i) {
        C3930am a;
        Cursor a2;
        String str;
        String str2;
        byte[] bArr;
        this.f111867a.mo8181p();
        try {
            TreeMap treeMap = C3930am.f12576a;
            a = C3929al.m11267a("SELECT * FROM RpcCache ORDER BY timestamp ASC, type, key LIMIT ?", 1);
            a.mo8204e(1, (long) i);
            this.f111867a.mo8175S();
            a2 = C3940b.m11293a(this.f111867a, a, false, (CancellationSignal) null);
            int b = C3939a.m11292b(a2, "type");
            int b2 = C3939a.m11292b(a2, "key");
            int b3 = C3939a.m11292b(a2, "timestamp");
            int b4 = C3939a.m11292b(a2, "proto_bytes");
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                if (a2.isNull(b)) {
                    str = null;
                } else {
                    str = a2.getString(b);
                }
                if (a2.isNull(b2)) {
                    str2 = null;
                } else {
                    str2 = a2.getString(b2);
                }
                long j = a2.getLong(b3);
                if (a2.isNull(b4)) {
                    bArr = null;
                } else {
                    bArr = a2.getBlob(b4);
                }
                arrayList.add(new C42674cu(str, str2, j, C42674cu.m75371a(bArr)));
            }
            a2.close();
            a.mo8207h();
            this.f111867a.mo8175S();
            this.f111867a.mo8181p();
            this.f111869c.mo8305c(arrayList);
            this.f111867a.mo8188w();
            this.f111867a.mo8183r();
            this.f111867a.mo8188w();
            this.f111867a.mo8183r();
        } catch (Throwable th) {
            this.f111867a.mo8183r();
            throw th;
        }
    }

    /* renamed from: b */
    public final int mo45762b(long j) {
        this.f111867a.mo8175S();
        C4057l d = this.f111870d.mo8212d();
        d.mo8204e(1, j);
        this.f111867a.mo8181p();
        try {
            int a = d.mo8256a();
            this.f111867a.mo8188w();
            return a;
        } finally {
            this.f111867a.mo8183r();
            this.f111870d.mo8215g(d);
        }
    }

    /* renamed from: c */
    public final long mo45763c() {
        TreeMap treeMap = C3930am.f12576a;
        C3930am a = C3929al.m11267a("SELECT COUNT(*) FROM RpcCache", 0);
        this.f111867a.mo8175S();
        Cursor a2 = C3940b.m11293a(this.f111867a, a, false, (CancellationSignal) null);
        try {
            return a2.moveToFirst() ? a2.getLong(0) : 0;
        } finally {
            a2.close();
            a.mo8207h();
        }
    }

    /* renamed from: d */
    public final List mo45764d(String str, List list, long j) {
        String str2;
        String str3;
        byte[] bArr;
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT   type,   key,   timestamp,   proto_bytes FROM   RpcCache WHERE   type = ?   AND   key IN (");
        int size = list.size();
        C3943e.m11297a(sb, size);
        sb.append(")   AND   timestamp >= ? ");
        String sb2 = sb.toString();
        int i = size + 2;
        TreeMap treeMap = C3930am.f12576a;
        C3930am a = C3929al.m11267a(sb2, i);
        if (str == null) {
            a.f12582g[1] = 1;
        } else {
            a.mo8206g(1, str);
        }
        Iterator it = list.iterator();
        int i2 = 2;
        while (it.hasNext()) {
            String str4 = (String) it.next();
            if (str4 == null) {
                a.f12582g[i2] = 1;
            } else {
                a.mo8206g(i2, str4);
            }
            i2++;
        }
        a.mo8204e(i, j);
        this.f111867a.mo8175S();
        Cursor a2 = C3940b.m11293a(this.f111867a, a, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                if (a2.isNull(0)) {
                    str2 = null;
                } else {
                    str2 = a2.getString(0);
                }
                if (a2.isNull(1)) {
                    str3 = null;
                } else {
                    str3 = a2.getString(1);
                }
                long j2 = a2.getLong(2);
                if (a2.isNull(3)) {
                    bArr = null;
                } else {
                    bArr = a2.getBlob(3);
                }
                arrayList.add(new C42674cu(str2, str3, j2, C42674cu.m75371a(bArr)));
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo8207h();
        }
    }

    /* renamed from: e */
    public final void mo45765e(List list) {
        this.f111867a.mo8175S();
        this.f111867a.mo8181p();
        try {
            this.f111868b.mo8307b(list);
            this.f111867a.mo8188w();
        } finally {
            this.f111867a.mo8183r();
        }
    }
}
