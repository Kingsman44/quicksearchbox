package com.google.android.gms.clearcut;

import android.os.Looper;
import android.os.SystemClock;
import androidx.p060c.C0981k;
import com.google.android.gms.common.api.C143854z;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143804cy;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.util.C144006f;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58151c;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58152d;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58153e;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58154f;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58155g;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58156h;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.google.android.gms.clearcut.z */
/* compiled from: PG */
public final class C143673z {

    /* renamed from: a */
    public static final Charset f389502a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f389503b = new byte[0];

    /* renamed from: c */
    public static final C143667t f389504c = new C143667t((byte[]) null);

    /* renamed from: d */
    public static final C143667t f389505d = new C143667t((byte[]) null);

    /* renamed from: e */
    public static final Comparator f389506e = C143660m.f389490a;

    /* renamed from: p */
    public static final C143665r f389507p = new C143665r(1);

    /* renamed from: f */
    public final int f389508f;

    /* renamed from: g */
    public final ReentrantReadWriteLock f389509g;

    /* renamed from: h */
    public boolean f389510h;

    /* renamed from: i */
    public volatile int f389511i;

    /* renamed from: j */
    public volatile Future f389512j;

    /* renamed from: k */
    public long f389513k;

    /* renamed from: l */
    public Map f389514l;

    /* renamed from: m */
    public C143667t f389515m;

    /* renamed from: n */
    public TreeMap f389516n;

    /* renamed from: o */
    public Integer f389517o;

    /* renamed from: q */
    private final String f389518q;

    /* renamed from: r */
    private final C143658k f389519r;

    /* renamed from: s */
    private ScheduledExecutorService f389520s;

    /* renamed from: t */
    private volatile C143670w f389521t;

    /* renamed from: u */
    private final C144006f f389522u;

    public C143673z(C143658k kVar, String str, int i, C144006f fVar) {
        this.f389509g = new ReentrantReadWriteLock();
        this.f389514l = new TreeMap();
        this.f389515m = f389504c;
        this.f389516n = new TreeMap();
        this.f389517o = null;
        this.f389521t = null;
        C143919bh.m233959b(i > 0);
        this.f389519r = kVar;
        this.f389518q = str;
        this.f389508f = i;
        this.f389522u = fVar;
        this.f389513k = SystemClock.elapsedRealtime();
    }

    /* renamed from: a */
    public static long m233396a(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes(f389502a));
            return ByteBuffer.wrap(instance.digest()).getLong();
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: b */
    public final C143664q mo119018b(String str) {
        this.f389509g.writeLock().lock();
        try {
            C143662o oVar = (C143662o) this.f389514l.get(str);
            if (oVar == null) {
                this.f389509g.writeLock().lock();
                C143664q qVar = new C143664q(this, str);
                this.f389514l.put(str, qVar);
                this.f389509g.writeLock().unlock();
                this.f389509g.writeLock().unlock();
                return qVar;
            }
            C143664q qVar2 = (C143664q) oVar;
            this.f389509g.writeLock().unlock();
            return qVar2;
        } catch (ClassCastException e) {
            throw new IllegalArgumentException("another type of counter exists with name: " + str, e);
        } catch (Throwable th) {
            this.f389509g.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: c */
    public final C143666s mo119019c(String str) {
        this.f389509g.writeLock().lock();
        try {
            C143662o oVar = (C143662o) this.f389514l.get(str);
            if (oVar == null) {
                this.f389509g.writeLock().lock();
                C143666s sVar = new C143666s(this, str);
                this.f389514l.put(str, sVar);
                this.f389509g.writeLock().unlock();
                this.f389509g.writeLock().unlock();
                return sVar;
            }
            C143666s sVar2 = (C143666s) oVar;
            this.f389509g.writeLock().unlock();
            return sVar2;
        } catch (ClassCastException e) {
            throw new IllegalArgumentException("another type of counter exists with name: " + str, e);
        } catch (Throwable th) {
            this.f389509g.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: d */
    public final C143669v mo119020d(String str) {
        this.f389509g.writeLock().lock();
        try {
            C143662o oVar = (C143662o) this.f389514l.get(str);
            if (oVar == null) {
                this.f389509g.writeLock().lock();
                C143669v vVar = new C143669v(this, str);
                this.f389514l.put(str, vVar);
                this.f389509g.writeLock().unlock();
                this.f389509g.writeLock().unlock();
                return vVar;
            }
            C143669v vVar2 = (C143669v) oVar;
            this.f389509g.writeLock().unlock();
            return vVar2;
        } catch (ClassCastException e) {
            throw new IllegalArgumentException("another type of counter exists with name: " + str, e);
        } catch (Throwable th) {
            this.f389509g.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: e */
    public final C143673z mo119021e() {
        this.f389509g.writeLock().lock();
        try {
            return new C143673z(this);
        } finally {
            this.f389509g.writeLock().unlock();
        }
    }

    /* renamed from: f */
    public final C143854z mo119022f() {
        int size = this.f389516n.size();
        C143657j[] jVarArr = new C143657j[size];
        Iterator it = this.f389516n.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            C143658k kVar = this.f389519r;
            byte[] bArr = ((C143667t) entry.getKey()).f389500a;
            int intValue = ((Integer) entry.getValue()).intValue();
            if (bArr == null) {
                bArr = f389504c.f389500a;
            }
            Integer valueOf = Integer.valueOf(intValue);
            ArrayList arrayList = new ArrayList(this.f389514l.size());
            for (C143662o oVar : this.f389514l.values()) {
                if (oVar.f389493b.mo3721a(valueOf.intValue()) >= 0) {
                    arrayList.add(oVar);
                }
            }
            C58155g gVar = (C58155g) C58156h.f155482e.createBuilder();
            long j = this.f389513k;
            gVar.copyOnWrite();
            C58156h hVar = (C58156h) gVar.instance;
            int i = 1;
            hVar.f155484a |= 1;
            hVar.f155485b = j;
            if (bArr.length != 0) {
                C63088z A = C63088z.m96139A(bArr);
                gVar.copyOnWrite();
                C58156h hVar2 = (C58156h) gVar.instance;
                hVar2.f155484a |= 4;
                hVar2.f155487d = A;
            }
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                C143662o oVar2 = (C143662o) arrayList.get(i2);
                C0981k kVar2 = (C0981k) oVar2.f389493b.mo3726e(valueOf.intValue());
                C143919bh.m233958a(kVar2);
                C58153e eVar = (C58153e) C58154f.f155477d.createBuilder();
                long a = m233396a(oVar2.f389492a);
                eVar.copyOnWrite();
                C58154f fVar = (C58154f) eVar.instance;
                fVar.f155479a = i;
                fVar.f155480b = Long.valueOf(a);
                ArrayList arrayList2 = new ArrayList(kVar2.mo3675c());
                int i3 = 0;
                while (i3 < kVar2.mo3675c()) {
                    C58151c cVar = (C58151c) C58152d.f155472d.createBuilder();
                    int i4 = size2;
                    Integer num = valueOf;
                    long d = kVar2.mo3677d(i3);
                    cVar.copyOnWrite();
                    Iterator it2 = it;
                    C58152d dVar = (C58152d) cVar.instance;
                    dVar.f155474a |= 1;
                    dVar.f155475b = d;
                    long j2 = ((long[]) kVar2.mo3680g(i3))[0];
                    cVar.copyOnWrite();
                    C58152d dVar2 = (C58152d) cVar.instance;
                    dVar2.f155474a |= 2;
                    dVar2.f155476c = j2;
                    arrayList2.add((C58152d) cVar.build());
                    i3++;
                    valueOf = num;
                    size2 = i4;
                    it = it2;
                    arrayList = arrayList;
                }
                Iterator it3 = it;
                int i5 = size2;
                Integer num2 = valueOf;
                ArrayList arrayList3 = arrayList;
                Collections.sort(arrayList2, C143668u.f389501a);
                eVar.copyOnWrite();
                C58154f fVar2 = (C58154f) eVar.instance;
                C62971cq cqVar = fVar2.f155481c;
                if (!cqVar.mo58948c()) {
                    fVar2.f155481c = C62942bv.mutableCopy(cqVar);
                }
                C62947c.addAll((Iterable) arrayList2, (List) fVar2.f155481c);
                C58154f fVar3 = (C58154f) eVar.build();
                gVar.copyOnWrite();
                C58156h hVar3 = (C58156h) gVar.instance;
                fVar3.getClass();
                C62971cq cqVar2 = hVar3.f155486c;
                if (!cqVar2.mo58948c()) {
                    hVar3.f155486c = C62942bv.mutableCopy(cqVar2);
                }
                hVar3.f155486c.add(fVar3);
                i2++;
                valueOf = num2;
                size2 = i5;
                it = it3;
                arrayList = arrayList3;
                i = 1;
            }
            jVarArr[((Integer) entry.getValue()).intValue()] = kVar.mo118999d((C58156h) gVar.build());
            it = it;
        }
        C143854z zVar = null;
        for (int i6 = 0; i6 < size; i6++) {
            C143657j jVar = jVarArr[i6];
            jVar.f389471m = this.f389518q;
            zVar = jVar.mo118992a();
        }
        if (zVar != null) {
            return zVar;
        }
        Status status = Status.f389615a;
        C143804cy cyVar = new C143804cy(Looper.getMainLooper());
        cyVar.mo119112p(status);
        return cyVar;
    }

    /* renamed from: g */
    public final Integer mo119023g(C143667t tVar) {
        Integer num = (Integer) this.f389516n.get(tVar);
        if (num != null) {
            return num;
        }
        Integer valueOf = Integer.valueOf(this.f389516n.size());
        this.f389516n.put(tVar, valueOf);
        return valueOf;
    }

    /* renamed from: h */
    public final void mo119024h() {
        this.f389509g.writeLock().lock();
        try {
            Future future = this.f389512j;
            if (future != null) {
                future.cancel(false);
            }
            this.f389512j = this.f389520s.schedule(new C143661n(this), (long) this.f389511i, TimeUnit.MILLISECONDS);
        } finally {
            this.f389509g.writeLock().unlock();
        }
    }

    /* renamed from: i */
    public final void mo119025i() {
        C143919bh.m233958a(this.f389519r);
        this.f389509g.writeLock().lock();
        try {
            this.f389510h = true;
        } finally {
            this.f389509g.writeLock().unlock();
        }
    }

    /* renamed from: j */
    public final void mo119026j(ScheduledExecutorService scheduledExecutorService, int i) {
        this.f389509g.writeLock().lock();
        try {
            this.f389520s = scheduledExecutorService;
            if (scheduledExecutorService != null) {
                this.f389511i = i;
                mo119024h();
            } else {
                this.f389511i = 0;
            }
        } finally {
            this.f389509g.writeLock().unlock();
        }
    }

    /* renamed from: k */
    public final void mo119027k(C143667t tVar) {
        if (tVar == null) {
            tVar = f389504c;
        }
        this.f389509g.writeLock().lock();
        try {
            this.f389515m = tVar;
            this.f389517o = null;
        } finally {
            this.f389509g.writeLock().unlock();
        }
    }

    /* renamed from: l */
    public final C143671x mo119028l(String str, C143665r rVar) {
        this.f389509g.writeLock().lock();
        try {
            C143662o oVar = (C143662o) this.f389514l.get(str);
            if (oVar == null) {
                this.f389509g.writeLock().lock();
                C143671x xVar = new C143671x(this, str, rVar);
                this.f389514l.put(str, xVar);
                this.f389509g.writeLock().unlock();
                this.f389509g.writeLock().unlock();
                return xVar;
            }
            C143671x xVar2 = (C143671x) oVar;
            if (rVar.equals(xVar2.f389498d)) {
                this.f389509g.writeLock().unlock();
                return xVar2;
            }
            throw new IllegalArgumentException("alias mismatch: " + str);
        } catch (ClassCastException e) {
            throw new IllegalArgumentException("another type of counter exists with name: " + str, e);
        } catch (Throwable th) {
            this.f389509g.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        this.f389509g.readLock().lock();
        try {
            sb.append("{");
            boolean z = true;
            for (Map.Entry entry : this.f389516n.entrySet()) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append("(");
                sb.append(entry.getKey());
                sb.append(") => ");
                sb.append(entry.getValue());
                z = false;
            }
            sb.append("}\n");
            for (C143662o oVar : this.f389514l.values()) {
                sb.append(oVar.toString());
                sb.append("\n");
            }
            this.f389509g.readLock().unlock();
            return sb.toString();
        } catch (Throwable th) {
            this.f389509g.readLock().unlock();
            throw th;
        }
    }

    private C143673z(C143673z zVar) {
        this(zVar.f389519r, zVar.f389518q, zVar.f389508f, zVar.f389522u);
        Object obj;
        ReentrantReadWriteLock.WriteLock writeLock = zVar.f389509g.writeLock();
        writeLock.lock();
        try {
            this.f389515m = zVar.f389515m;
            this.f389517o = zVar.f389517o;
            this.f389513k = zVar.f389513k;
            this.f389514l = new TreeMap();
            for (Map.Entry entry : zVar.f389514l.entrySet()) {
                Map map = this.f389514l;
                String str = (String) entry.getKey();
                C143662o oVar = (C143662o) entry.getValue();
                if (oVar instanceof C143666s) {
                    obj = new C143666s(this, (C143666s) oVar);
                } else if (oVar instanceof C143672y) {
                    obj = new C143672y(this, (C143672y) oVar);
                } else if (oVar instanceof C143669v) {
                    obj = new C143669v(this, (C143669v) oVar);
                } else if (oVar instanceof C143671x) {
                    obj = new C143671x(this, (C143671x) oVar);
                } else if (oVar instanceof C143664q) {
                    obj = new C143664q(this, (C143664q) oVar);
                } else {
                    throw new IllegalArgumentException("Unknown counter type: ".concat(String.valueOf(String.valueOf(oVar))));
                }
                map.put(str, obj);
            }
            TreeMap treeMap = this.f389516n;
            this.f389516n = zVar.f389516n;
            zVar.f389516n = treeMap;
            zVar.f389517o = null;
            zVar.f389513k = SystemClock.elapsedRealtime();
        } finally {
            writeLock.unlock();
        }
    }
}
