package com.google.android.gms.reminders.internal.ref;

import android.text.TextUtils;
import com.google.android.gms.common.data.C143865e;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.reminders.internal.ref.a */
/* compiled from: PG */
public class C145815a extends C143865e {

    /* renamed from: d */
    protected final String f394233d;

    /* renamed from: e */
    protected int f394234e;

    /* renamed from: f */
    private final boolean f394235f;

    public C145815a(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i);
        this.f394233d = str;
        this.f394235f = TextUtils.isEmpty(str);
    }

    /* renamed from: v */
    protected static String m237273v(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str.concat(str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: kw */
    public final void mo119338kw(int i) {
        super.mo119338kw(i);
        this.f394234e = this.f389974a.mo119316a(this.f389975b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Double mo122097r(String str) {
        if (mo119331e(str)) {
            return null;
        }
        DataHolder dataHolder = this.f389974a;
        int i = this.f389975b;
        int i2 = this.f389976c;
        dataHolder.mo119318c(str, i);
        return Double.valueOf(dataHolder.f389964d[i2].getDouble(i, dataHolder.f389963c.getInt(str)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final Integer mo122098s(String str) {
        if (mo119331e(str)) {
            return null;
        }
        return Integer.valueOf(mo119336ks(str));
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final Long mo122099t(String str) {
        if (mo119331e(str)) {
            return null;
        }
        DataHolder dataHolder = this.f389974a;
        int i = this.f389975b;
        int i2 = this.f389976c;
        dataHolder.mo119318c(str, i);
        return Long.valueOf(dataHolder.f389964d[i2].getLong(i, dataHolder.f389963c.getInt(str)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final String mo122100u(String str) {
        return this.f394235f ? str : this.f394233d.concat(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final List mo122101w(String str) {
        if (mo119331e(str)) {
            return new ArrayList(0);
        }
        String kv = mo119337kv(str);
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(kv)) {
            for (String valueOf : TextUtils.split(kv, ",")) {
                arrayList.add(Integer.valueOf(valueOf));
            }
        }
        return arrayList;
    }
}
