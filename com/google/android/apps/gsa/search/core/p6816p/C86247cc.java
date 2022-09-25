package com.google.android.apps.gsa.search.core.p6816p;

import android.text.TextUtils;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90964a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.base.C58832aw;
import com.google.common.p4526f.C59071e;
import com.google.p4500cm.p4518d.p4519a.C58179b;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.search.core.p.cc */
/* compiled from: PG */
public final class C86247cc implements C90964a {

    /* renamed from: a */
    public static final C59071e f233132a = C59071e.m91332i("com.google.android.apps.gsa.search.core.p.cc");

    /* renamed from: b */
    public final String f233133b;

    /* renamed from: c */
    public final String f233134c;

    /* renamed from: d */
    public volatile C58179b f233135d;

    /* renamed from: e */
    public final Boolean f233136e;

    public C86247cc(String str, String str2, C58179b bVar, Boolean bool) {
        this.f233133b = str;
        this.f233134c = str2;
        this.f233135d = bVar;
        this.f233136e = bool;
    }

    /* renamed from: a */
    public final boolean mo79940a() {
        return (this.f233135d == null || (this.f233135d.f155536a & 16) == 0 || !this.f233135d.f155539d) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C86247cc)) {
            return false;
        }
        C86247cc ccVar = (C86247cc) obj;
        if (!TextUtils.equals(this.f233133b, ccVar.f233133b) || !TextUtils.equals(this.f233134c, ccVar.f233134c) || this.f233135d != ccVar.f233135d || !C58832aw.m90831a(this.f233136e, ccVar.f233136e)) {
            return false;
        }
        return true;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        C90752i iVar;
        fVar.mo85291r("SRP MetaData");
        fVar.mo85279c("eventId").mo85276a(C90752i.m148229c(this.f233133b));
        fVar.mo85279c("rewrittenQuery").mo85276a(C90752i.m148233g(this.f233134c));
        C91005e c = fVar.mo85279c("personalAnswerOrAction");
        if ((this.f233135d.f155536a & 2048) != 0) {
            iVar = C90752i.m148229c(String.valueOf(this.f233135d.f155544i));
        } else {
            iVar = C90752i.m148229c("<absent>");
        }
        c.mo85276a(iVar);
        fVar.mo85279c("assistOverlayValue").mo85276a(C90752i.m148229c(String.valueOf(this.f233136e)));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f233133b, this.f233135d, this.f233134c, this.f233136e});
    }

    public final String toString() {
        return String.format("SrpMetadata{eventId: %s, rewrittenQuery: %s, metadata: %s, showInAssistOverlay: %s}", new Object[]{this.f233133b, this.f233134c, this.f233135d, this.f233136e});
    }
}
