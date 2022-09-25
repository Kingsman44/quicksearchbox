package com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8582f;

import android.content.ComponentName;
import android.content.Context;
import android.media.session.MediaSessionManager;
import android.support.p031v4.media.session.C0320v;
import android.support.p031v4.media.session.MediaSessionCompat;
import com.google.android.apps.gsa.shared.util.permissions.C91077d;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.f.c */
/* compiled from: PG */
public final class C113419c implements C113417a {

    /* renamed from: a */
    private static final C59071e f314081a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.shared.f.c");

    /* renamed from: b */
    private final Context f314082b;

    /* renamed from: c */
    private final C68214a f314083c;

    public C113419c(Context context, C68214a aVar) {
        this.f314082b = context;
        this.f314083c = aVar;
    }

    /* renamed from: a */
    public final C0320v mo100227a(MediaSessionCompat.Token token) {
        return new C0320v(this.f314082b, token);
    }

    /* renamed from: b */
    public final List mo100228b() {
        if (C91077d.m148794e(this.f314082b, "android.permission.MEDIA_CONTENT_CONTROL")) {
            return (List) Collection.EL.stream(((MediaSessionManager) this.f314083c.mo27525b()).getActiveSessions((ComponentName) null)).map(new C113418b(this)).collect(C58370cn.f155946a);
        }
        C59104x d = f314081a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "MediaControllerProImp");
        ((C59052c) ((C59052c) d).mo56372aa(27863)).mo56386p("No MEDIA_CONTENT_CONTROL permission granted.");
        return C58485gu.m89845m();
    }
}
