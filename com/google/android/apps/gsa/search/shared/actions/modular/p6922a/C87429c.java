package com.google.android.apps.gsa.search.shared.actions.modular.p6922a;

import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58817ah;
import com.google.common.p4535g.C59203do;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.search.shared.actions.modular.a.c */
/* compiled from: PG */
public final class C87429c {

    /* renamed from: a */
    public static final C87429c f236122a = new C87429c(1, (String) null, (String[]) null, (Uri) null, 0, 0, false, C59203do.f157270a, (ArrayList) null, (byte[]) null, (Collection) null);

    /* renamed from: b */
    public static final C58817ah f236123b = new C87427a();

    /* renamed from: c */
    public static final C58817ah f236124c = new C87428b();

    /* renamed from: d */
    public final String f236125d;

    /* renamed from: e */
    public final double f236126e;

    /* renamed from: f */
    public final int f236127f;

    /* renamed from: g */
    public final long f236128g;

    /* renamed from: h */
    public final boolean f236129h;

    /* renamed from: i */
    public final String[] f236130i;

    /* renamed from: j */
    public final byte[] f236131j;

    /* renamed from: k */
    public final ArrayList f236132k;

    /* renamed from: l */
    public final Collection f236133l;

    /* renamed from: m */
    public final int f236134m;

    /* renamed from: n */
    private final Uri f236135n;

    public C87429c(int i) {
        this(4, (String) null, (String[]) null, (Uri) null, i, 0, false, C59203do.f157270a, (ArrayList) null, (byte[]) null, (Collection) null);
    }

    public C87429c(int i, String str, String[] strArr, Uri uri, int i2, long j, boolean z, double d, ArrayList arrayList, byte[] bArr, Collection collection) {
        this.f236134m = i;
        this.f236125d = str;
        this.f236135n = uri;
        this.f236127f = i2;
        this.f236128g = j;
        this.f236129h = z;
        this.f236130i = strArr;
        this.f236126e = d;
        this.f236132k = arrayList;
        this.f236131j = bArr;
        this.f236133l = collection;
    }

    /* renamed from: c */
    public final Object mo81244c() {
        Collection collection = this.f236133l;
        if (collection != null) {
            return collection;
        }
        int i = this.f236134m - 1;
        if (i == 11) {
            return this.f236131j;
        }
        switch (i) {
            case 1:
                return this.f236125d;
            case 2:
                return this.f236135n;
            case 3:
                return Integer.valueOf(this.f236127f);
            case 4:
                return Long.valueOf(this.f236128g);
            case 5:
                return Boolean.valueOf(this.f236129h);
            case 6:
                return this.f236130i;
            case 7:
                return Double.valueOf(this.f236126e);
            case 8:
                return this.f236132k;
            default:
                throw new IllegalArgumentException("Can't return object of unknown type ".concat(Integer.toString(i)));
        }
    }

    /* renamed from: e */
    public final ArrayList mo81246e(Collection collection, C58817ah ahVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C87429c cVar = (C87429c) it.next();
            if (cVar.mo81247f()) {
                Object apply = ahVar.apply(cVar);
                apply.getClass();
                arrayList.add(apply);
            } else {
                throw new IllegalArgumentException("ArgumentValue is unset");
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public final boolean mo81247f() {
        return this != f236122a;
    }

    public C87429c(long j) {
        this(5, (String) null, (String[]) null, (Uri) null, 0, j, false, C59203do.f157270a, (ArrayList) null, (byte[]) null, (Collection) null);
    }

    /* renamed from: a */
    public final int mo81242a() {
        int i = this.f236134m - 1;
        if (i == 1) {
            String str = this.f236125d;
            str.getClass();
            return Integer.parseInt(str);
        } else if (i == 7) {
            return (int) this.f236126e;
        } else {
            if (i == 3) {
                return this.f236127f;
            }
            if (i == 4) {
                return (int) this.f236128g;
            }
            if (i != 5) {
                throw new IllegalArgumentException("Can't convert to integer (type=" + Integer.toString(i) + ")");
            } else if (this.f236129h) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    /* renamed from: b */
    public final Uri mo81243b() {
        int i = this.f236134m - 1;
        if (i == 1) {
            return Uri.parse(this.f236125d);
        }
        if (i == 2) {
            return this.f236135n;
        }
        throw new IllegalArgumentException("Can't convert to URI (type=" + Integer.toString(i) + ")");
    }

    public C87429c(Uri uri) {
        this(3, (String) null, (String[]) null, uri, 0, 0, false, C59203do.f157270a, (ArrayList) null, (byte[]) null, (Collection) null);
    }

    /* renamed from: d */
    public final String mo81245d() {
        int i = this.f236134m - 1;
        if (i == 1) {
            String str = this.f236125d;
            return str == null ? BuildConfig.FLAVOR : str;
        } else if (i == 2) {
            Uri uri = this.f236135n;
            if (uri == null) {
                return BuildConfig.FLAVOR;
            }
            return uri.toString();
        } else if (i == 3) {
            return Integer.toString(this.f236127f);
        } else {
            if (i == 4) {
                return Long.toString(this.f236128g);
            }
            if (i == 5) {
                return Boolean.toString(this.f236129h);
            }
            if (i == 7) {
                return Double.toString(this.f236126e);
            }
            if (i == 11) {
                byte[] bArr = this.f236131j;
                if (bArr == null) {
                    return BuildConfig.FLAVOR;
                }
                try {
                    return new String(bArr, "UTF-8");
                } catch (UnsupportedEncodingException unused) {
                    throw new IllegalArgumentException("Can't convert to String (type=" + Integer.toString(this.f236134m - 1) + ")");
                }
            } else {
                throw new IllegalArgumentException("Can't convert to String (type=" + Integer.toString(i) + ")");
            }
        }
    }

    public C87429c(String str) {
        this(2, str, (String[]) null, (Uri) null, 0, 0, false, C59203do.f157270a, (ArrayList) null, (byte[]) null, (Collection) null);
    }

    public C87429c(ArrayList arrayList) {
        this(9, (String) null, (String[]) null, (Uri) null, 0, 0, false, C59203do.f157270a, arrayList, (byte[]) null, (Collection) null);
    }

    public C87429c(Collection collection) {
        this(1, (String) null, (String[]) null, (Uri) null, 0, 0, false, C59203do.f157270a, (ArrayList) null, (byte[]) null, collection);
    }

    public C87429c(boolean z) {
        this(6, (String) null, (String[]) null, (Uri) null, 0, 0, z, C59203do.f157270a, (ArrayList) null, (byte[]) null, (Collection) null);
    }
}
