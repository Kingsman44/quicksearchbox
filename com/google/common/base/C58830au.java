package com.google.common.base;

import com.evernote.android.state.BuildConfig;
import java.util.Arrays;

/* renamed from: com.google.common.base.au */
/* compiled from: PG */
public final class C58830au {

    /* renamed from: a */
    public boolean f156627a = false;

    /* renamed from: b */
    private final String f156628b;

    /* renamed from: c */
    private final C58829at f156629c;

    /* renamed from: d */
    private C58829at f156630d;

    public C58830au(String str) {
        C58829at atVar = new C58829at();
        this.f156629c = atVar;
        this.f156630d = atVar;
        str.getClass();
        this.f156628b = str;
    }

    /* renamed from: a */
    public final C58829at mo56101a() {
        C58829at atVar = new C58829at();
        this.f156630d.f156626c = atVar;
        this.f156630d = atVar;
        return atVar;
    }

    /* renamed from: b */
    public final void mo56102b(String str, Object obj) {
        C58829at a = mo56101a();
        a.f156625b = obj;
        a.f156624a = str;
    }

    /* renamed from: c */
    public final void mo56103c(String str, Object obj) {
        C58828as asVar = new C58828as();
        this.f156630d.f156626c = asVar;
        this.f156630d = asVar;
        asVar.f156625b = obj;
        asVar.f156624a = str;
    }

    public final String toString() {
        boolean z = this.f156627a;
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f156628b);
        sb.append('{');
        String str = BuildConfig.FLAVOR;
        for (C58829at atVar = this.f156629c.f156626c; atVar != null; atVar = atVar.f156626c) {
            Object obj = atVar.f156625b;
            if ((atVar instanceof C58828as) || obj != null || !z) {
                sb.append(str);
                String str2 = atVar.f156624a;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    sb.append(obj);
                } else {
                    String deepToString = Arrays.deepToString(new Object[]{obj});
                    sb.append(deepToString, 1, deepToString.length() - 1);
                }
                str = ", ";
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
