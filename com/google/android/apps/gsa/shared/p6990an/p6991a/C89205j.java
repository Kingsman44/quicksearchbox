package com.google.android.apps.gsa.shared.p6990an.p6991a;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.common.p4575r.C60761r;
import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.shared.an.a.j */
/* compiled from: PG */
public final class C89205j {

    /* renamed from: a */
    public final Object f241828a;

    /* renamed from: b */
    private final String f241829b;

    /* renamed from: c */
    private final C89206k f241830c;

    protected C89205j(String str, C89206k kVar) {
        this.f241829b = str;
        this.f241830c = kVar;
        this.f241828a = kVar.mo82387b();
    }

    /* renamed from: a */
    public final int mo83161a(String str) {
        int i;
        Object obj = this.f241828a;
        if (obj == null) {
            return mo83163c().getInt(str);
        }
        synchronized (obj) {
            i = mo83163c().getInt(str);
        }
        return i;
    }

    /* renamed from: b */
    public final long mo83162b(String str) {
        long j;
        Object obj = this.f241828a;
        if (obj == null) {
            return mo83163c().getLong(str);
        }
        synchronized (obj) {
            j = mo83163c().getLong(str);
        }
        return j;
    }

    /* renamed from: c */
    public final Bundle mo83163c() {
        return this.f241830c.mo82386a(this.f241829b);
    }

    /* renamed from: d */
    public final Parcelable mo83164d(String str) {
        Parcelable parcelable;
        Object obj = this.f241828a;
        if (obj == null) {
            return mo83163c().getParcelable(str);
        }
        synchronized (obj) {
            parcelable = mo83163c().getParcelable(str);
        }
        return parcelable;
    }

    /* renamed from: e */
    public final Serializable mo83165e(String str) {
        Serializable serializable;
        Object obj = this.f241828a;
        if (obj == null) {
            return mo83163c().getSerializable(str);
        }
        synchronized (obj) {
            serializable = mo83163c().getSerializable(str);
        }
        return serializable;
    }

    /* renamed from: f */
    public final String mo83166f(String str) {
        String string;
        Object obj = this.f241828a;
        if (obj == null) {
            return mo83163c().getString(str);
        }
        synchronized (obj) {
            string = mo83163c().getString(str);
        }
        return string;
    }

    /* renamed from: g */
    public final ArrayList mo83167g(String str) {
        ArrayList<Integer> integerArrayList;
        Object obj = this.f241828a;
        if (obj == null) {
            return mo83163c().getIntegerArrayList(str);
        }
        synchronized (obj) {
            integerArrayList = mo83163c().getIntegerArrayList(str);
        }
        return integerArrayList;
    }

    /* renamed from: h */
    public final void mo83168h() {
        Object obj = this.f241828a;
        if (obj != null) {
            synchronized (obj) {
                mo83163c().clear();
            }
            return;
        }
        mo83163c().clear();
    }

    /* renamed from: i */
    public final void mo83169i(String str) {
        Object obj = this.f241828a;
        if (obj != null) {
            synchronized (obj) {
                mo83171k(str, mo83161a(str) + 1);
            }
            return;
        }
        mo83171k(str, mo83161a(str) + 1);
    }

    /* renamed from: j */
    public final void mo83170j(String str, boolean z) {
        Object obj = this.f241828a;
        if (obj != null) {
            synchronized (obj) {
                mo83163c().putBoolean(str, z);
            }
            return;
        }
        mo83163c().putBoolean(str, z);
    }

    /* renamed from: k */
    public final void mo83171k(String str, int i) {
        Object obj = this.f241828a;
        if (obj != null) {
            synchronized (obj) {
                mo83163c().putInt(str, i);
            }
            return;
        }
        mo83163c().putInt(str, i);
    }

    /* renamed from: l */
    public final void mo83172l(String str, ArrayList arrayList) {
        Object obj = this.f241828a;
        if (obj != null) {
            synchronized (obj) {
                mo83163c().putIntegerArrayList(str, arrayList);
            }
            return;
        }
        mo83163c().putIntegerArrayList(str, arrayList);
    }

    /* renamed from: m */
    public final void mo83173m(String str, long j) {
        Object obj = this.f241828a;
        if (obj != null) {
            synchronized (obj) {
                mo83163c().putLong(str, j);
            }
            return;
        }
        mo83163c().putLong(str, j);
    }

    /* renamed from: n */
    public final void mo83174n(String str, Parcelable parcelable) {
        Object obj = this.f241828a;
        if (obj != null) {
            synchronized (obj) {
                mo83163c().putParcelable(str, parcelable);
            }
            return;
        }
        mo83163c().putParcelable(str, parcelable);
    }

    /* renamed from: o */
    public final void mo83175o(String str, Serializable serializable) {
        Object obj = this.f241828a;
        if (obj != null) {
            synchronized (obj) {
                mo83163c().putSerializable(str, serializable);
            }
            return;
        }
        mo83163c().putSerializable(str, serializable);
    }

    /* renamed from: p */
    public final void mo83176p(String str, String str2) {
        Object obj = this.f241828a;
        if (obj != null) {
            synchronized (obj) {
                mo83163c().putString(str, str2);
            }
            return;
        }
        mo83163c().putString(str, str2);
    }

    /* renamed from: q */
    public final boolean mo83177q(String str) {
        boolean containsKey;
        Object obj = this.f241828a;
        if (obj == null) {
            return mo83163c().containsKey(str);
        }
        synchronized (obj) {
            containsKey = mo83163c().containsKey(str);
        }
        return containsKey;
    }

    /* renamed from: r */
    public final boolean mo83178r(String str) {
        boolean z;
        Object obj = this.f241828a;
        if (obj == null) {
            return mo83163c().getBoolean(str);
        }
        synchronized (obj) {
            z = mo83163c().getBoolean(str);
        }
        return z;
    }

    /* renamed from: s */
    public final ArrayList mo83179s() {
        ArrayList arrayList;
        Object obj = this.f241828a;
        if (obj != null) {
            synchronized (obj) {
                if (mo83163c().getLongArray("GWS_EVENT_ID_HASHES") == null) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = new ArrayList(C60761r.m92759e(mo83163c().getLongArray("GWS_EVENT_ID_HASHES")));
                }
            }
            return arrayList;
        } else if (mo83163c().getLongArray("GWS_EVENT_ID_HASHES") == null) {
            return new ArrayList();
        } else {
            return new ArrayList(C60761r.m92759e(mo83163c().getLongArray("GWS_EVENT_ID_HASHES")));
        }
    }

    /* renamed from: t */
    public final ArrayList mo83180t() {
        ArrayList parcelableArrayList;
        Object obj = this.f241828a;
        if (obj == null) {
            return mo83163c().getParcelableArrayList("QUERY_BUILDER_CHIP_TAP");
        }
        synchronized (obj) {
            parcelableArrayList = mo83163c().getParcelableArrayList("QUERY_BUILDER_CHIP_TAP");
        }
        return parcelableArrayList;
    }

    /* renamed from: u */
    public final ArrayList mo83181u() {
        ArrayList<String> stringArrayList;
        Object obj = this.f241828a;
        if (obj == null) {
            return mo83163c().getStringArrayList("ALL_SHOWN_SUGGESTION_TYPES_SUBTYPES_IN_SESSION");
        }
        synchronized (obj) {
            stringArrayList = mo83163c().getStringArrayList("ALL_SHOWN_SUGGESTION_TYPES_SUBTYPES_IN_SESSION");
        }
        return stringArrayList;
    }

    /* renamed from: v */
    public final void mo83182v(ArrayList arrayList) {
        Object obj = this.f241828a;
        if (obj != null) {
            synchronized (obj) {
                mo83163c().putLongArray("GWS_EVENT_ID_HASHES", C60761r.m92761g(arrayList));
            }
            return;
        }
        mo83163c().putLongArray("GWS_EVENT_ID_HASHES", C60761r.m92761g(arrayList));
    }

    /* renamed from: w */
    public final void mo83183w(ArrayList arrayList) {
        Object obj = this.f241828a;
        if (obj != null) {
            synchronized (obj) {
                mo83163c().putStringArrayList("ALL_SHOWN_SUGGESTION_TYPES_SUBTYPES_IN_SESSION", arrayList);
            }
            return;
        }
        mo83163c().putStringArrayList("ALL_SHOWN_SUGGESTION_TYPES_SUBTYPES_IN_SESSION", arrayList);
    }
}
