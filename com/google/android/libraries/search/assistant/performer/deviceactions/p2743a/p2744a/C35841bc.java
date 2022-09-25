package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import androidx.slice.C4110i;
import androidx.slice.C4113l;
import androidx.slice.C4114m;
import androidx.slice.Slice;
import androidx.slice.p194a.C4094a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60887da;
import java.util.List;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.bc */
/* compiled from: PG */
public final class C35841bc {

    /* renamed from: a */
    public static final C59071e f93920a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.deviceactions.a.a.bc");

    /* renamed from: b */
    public final Context f93921b;

    /* renamed from: c */
    public final String f93922c;

    /* renamed from: d */
    public final C60887da f93923d;

    /* renamed from: e */
    public Uri f93924e;

    /* renamed from: f */
    public Slice f93925f;

    /* renamed from: g */
    private final C4114m f93926g;

    /* renamed from: h */
    private C4113l f93927h;

    public C35841bc(Context context, C60887da daVar, C4114m mVar, String str) {
        this.f93921b = context;
        this.f93922c = str;
        this.f93923d = daVar;
        this.f93926g = mVar;
    }

    /* renamed from: a */
    public final void mo39863a() {
        if (this.f93926g != null && this.f93924e != null && this.f93927h != null) {
            ((C59052c) ((C59052c) f93920a.mo56224b()).mo56372aa(51968)).mo56386p("#slice writer: unregisterCallback");
            this.f93926g.mo8630e(this.f93924e, this.f93927h);
        }
    }

    /* renamed from: b */
    public final boolean mo39864b() {
        Boolean[] boolArr = new Boolean[1];
        C35840bb bbVar = new C35840bb(this, boolArr);
        this.f93927h = bbVar;
        try {
            this.f93926g.mo8628c(this.f93924e, bbVar);
            this.f93927h.mo8625a(this.f93926g.mo8626a(this.f93924e));
            return boolArr[0].booleanValue();
        } catch (Resources.NotFoundException | IllegalArgumentException | NullPointerException | SecurityException e) {
            ((C59052c) ((C59052c) ((C59052c) f93920a.mo56226d()).mo56382g(e)).mo56372aa(51970)).mo56386p("Can't access slice URI.");
            mo39863a();
            return false;
        }
    }

    /* renamed from: c */
    public final boolean mo39865c(PendingIntent pendingIntent, Intent intent) {
        try {
            ((C59052c) ((C59052c) f93920a.mo56224b()).mo56372aa(51971)).mo56386p("Fire pending intent.");
            pendingIntent.send(this.f93921b, 0, intent);
            return true;
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) f93920a.mo56226d()).mo56382g(e)).mo56372aa(51972)).mo56386p("Intent was canceled.");
            return false;
        }
    }

    /* renamed from: d */
    public final boolean mo39866d(boolean z) {
        Slice slice = this.f93925f;
        if (slice == null) {
            return false;
        }
        List h = new C4110i(this.f93921b, slice).mo8619h();
        if (h.isEmpty()) {
            return false;
        }
        return mo39865c(((C4094a) h.get(0)).mo8605b(), new Intent().putExtra("android.app.slice.extra.TOGGLE_STATE", z));
    }
}
