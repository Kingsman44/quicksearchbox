package com.google.android.apps.gsa.staticplugins.p7885e;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.google.C85854al;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.common.base.C58837ba;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.e.b */
/* compiled from: PG */
public final class C100326b {

    /* renamed from: a */
    private final C85929cw f280559a;

    /* renamed from: b */
    private final C85854al f280560b;

    /* renamed from: c */
    private final String f280561c;

    public C100326b(C85929cw cwVar, C85854al alVar, String str) {
        this.f280559a = cwVar;
        this.f280560b = alVar;
        this.f280561c = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Uri mo91889a(String str, List list, Integer num, String str2, boolean z) {
        if (!C58837ba.m90859h(str2)) {
            return this.f280559a.mo79564d((Uri) null, str2);
        }
        Uri.Builder builder = new Uri.Builder();
        if (!C58837ba.m90859h(str) && !list.isEmpty()) {
            builder.appendQueryParameter("vgi", str);
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Uri.encode((String) it.next()));
            }
            builder.appendQueryParameter("amp", TextUtils.join(",", arrayList));
            if (num != null) {
                builder.appendQueryParameter("ampidx", Integer.toString(num.intValue()));
            }
            if (z) {
                builder.appendQueryParameter("story", "1");
            }
        }
        return this.f280559a.mo79564d((Uri) null, new Uri.Builder().encodedPath("/amp/embedded").appendQueryParameter("v", this.f280561c).appendQueryParameter("hl", this.f280560b.mo79488a()).encodedFragment(builder.build().getEncodedQuery()).toString());
    }

    /* renamed from: b */
    public final Uri mo91890b(String str, boolean z) {
        boolean startsWith = str.startsWith("https");
        StringBuilder sb = new StringBuilder("/amp/");
        if (z) {
            sb.append("story/");
        }
        if (startsWith) {
            sb.append("s/");
        }
        sb.append(str, str.indexOf("//") + 2, str.length());
        return this.f280559a.mo79564d((Uri) null, sb.toString().replace("%", "%25").replace("?", "%3F").replace("#", "%23"));
    }
}
