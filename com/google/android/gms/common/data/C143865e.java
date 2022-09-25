package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.C143919bh;
import java.util.Arrays;

/* renamed from: com.google.android.gms.common.data.e */
/* compiled from: PG */
public class C143865e {

    /* renamed from: a */
    protected final DataHolder f389974a;

    /* renamed from: b */
    protected int f389975b;

    /* renamed from: c */
    public int f389976c;

    public C143865e(DataHolder dataHolder, int i) {
        C143919bh.m233958a(dataHolder);
        this.f389974a = dataHolder;
        mo119338kw(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo119330d(String str) {
        DataHolder dataHolder = this.f389974a;
        int i = this.f389975b;
        int i2 = this.f389976c;
        dataHolder.mo119318c(str, i);
        return Long.valueOf(dataHolder.f389964d[i2].getLong(i, dataHolder.f389963c.getInt(str))).longValue() == 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo119331e(String str) {
        return this.f389974a.mo119320d(str, this.f389975b, this.f389976c);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C143865e) {
            C143865e eVar = (C143865e) obj;
            if (!C143912ba.m233950b(Integer.valueOf(eVar.f389975b), Integer.valueOf(this.f389975b)) || !C143912ba.m233950b(Integer.valueOf(eVar.f389976c), Integer.valueOf(this.f389976c)) || eVar.f389974a != this.f389974a) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo119333f() {
        throw null;
    }

    /* renamed from: g */
    public final byte[] mo119334g(String str) {
        return this.f389974a.mo119321e(str, this.f389975b, this.f389976c);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f389975b), Integer.valueOf(this.f389976c), this.f389974a});
    }

    /* renamed from: ks */
    public final int mo119336ks(String str) {
        DataHolder dataHolder = this.f389974a;
        int i = this.f389975b;
        int i2 = this.f389976c;
        dataHolder.mo119318c(str, i);
        return dataHolder.f389964d[i2].getInt(i, dataHolder.f389963c.getInt(str));
    }

    /* renamed from: kv */
    public final String mo119337kv(String str) {
        return this.f389974a.mo119317b(str, this.f389975b, this.f389976c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: kw */
    public void mo119338kw(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f389974a.f389968h) {
            z = true;
        }
        C143919bh.m233966i(z);
        this.f389975b = i;
        this.f389976c = this.f389974a.mo119316a(i);
    }
}
