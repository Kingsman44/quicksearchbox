package com.google.android.libraries.web.webview.p3492k.p3493a;

import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import com.google.android.libraries.web.webview.p3474c.p3475a.C44350a;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.web.webview.k.a.m */
/* compiled from: PG */
final class C44472m extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C44475p f115610a;

    /* renamed from: b */
    final /* synthetic */ WebBackForwardList f115611b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44472m(C44475p pVar, WebBackForwardList webBackForwardList) {
        super(1);
        this.f115610a = pVar;
        this.f115611b = webBackForwardList;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        int intValue = ((Number) obj).intValue();
        boolean z = true;
        if (this.f115610a.f115620e) {
            WebHistoryItem itemAtIndex = this.f115611b.getItemAtIndex(intValue + 1);
            C69664n.m101058d(itemAtIndex);
            String url = itemAtIndex.getUrl();
            C69664n.m101060f(url, "history.getItemAtIndex(index + 1)!!.url");
            if (C44350a.m78300a(url)) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
