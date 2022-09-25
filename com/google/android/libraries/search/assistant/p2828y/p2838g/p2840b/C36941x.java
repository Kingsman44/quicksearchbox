package com.google.android.libraries.search.assistant.p2828y.p2838g.p2840b;

import android.media.session.MediaController;
import android.media.session.MediaSession;
import com.google.common.base.C58832aw;
import java.util.Arrays;

/* renamed from: com.google.android.libraries.search.assistant.y.g.b.x */
/* compiled from: PG */
final class C36941x implements Comparable {

    /* renamed from: a */
    private final String f96197a;

    /* renamed from: b */
    private final MediaSession.Token f96198b;

    public C36941x(MediaController mediaController) {
        this.f96197a = mediaController.getPackageName();
        this.f96198b = mediaController.getSessionToken();
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C36941x xVar = (C36941x) obj;
        if (C58832aw.m90831a(this.f96197a, xVar.f96197a)) {
            return (((long) this.f96198b.hashCode()) > ((long) xVar.f96198b.hashCode()) ? 1 : (((long) this.f96198b.hashCode()) == ((long) xVar.f96198b.hashCode()) ? 0 : -1));
        }
        String str = this.f96197a;
        if (str == null) {
            return -1;
        }
        String str2 = xVar.f96197a;
        if (str2 == null) {
            return 1;
        }
        return str.compareTo(str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C36941x)) {
            return false;
        }
        C36941x xVar = (C36941x) obj;
        if (!this.f96197a.equals(xVar.f96197a) || !this.f96198b.equals(xVar.f96198b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f96197a, this.f96198b});
    }
}
