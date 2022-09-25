package com.google.android.apps.gsa.staticplugins.accl.performers;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.gsa.shared.util.p7159c.C90880an;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.af */
/* compiled from: PG */
final class C92871af extends C90880an {

    /* renamed from: a */
    final /* synthetic */ ContentResolver f259098a;

    /* renamed from: b */
    final /* synthetic */ Uri f259099b;

    /* renamed from: c */
    final /* synthetic */ String f259100c;

    /* renamed from: d */
    final /* synthetic */ Bundle f259101d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92871af(ContentResolver contentResolver, Uri uri, String str, Bundle bundle) {
        super("Get-wellbeing-state", 1, 8);
        this.f259098a = contentResolver;
        this.f259099b = uri;
        this.f259100c = str;
        this.f259101d = bundle;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        try {
            return C58833ax.m90833j(this.f259098a.call(this.f259099b, this.f259100c, (String) null, this.f259101d));
        } catch (Exception e) {
            C59104x d = C92872ag.f259102a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "WellbeingPerformer");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(13072)).mo56389s("Error calling Sunshine ContentResolver API %s,", this.f259100c);
            return C58836b.f156633a;
        }
    }
}
