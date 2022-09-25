package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import androidx.slice.C4113l;
import androidx.slice.C4114m;
import androidx.slice.Slice;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60887da;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.ax */
/* compiled from: PG */
public final class C35835ax {

    /* renamed from: a */
    public static final C59071e f93904a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.deviceactions.a.a.ax");

    /* renamed from: b */
    public final Context f93905b;

    /* renamed from: c */
    public final String f93906c;

    /* renamed from: d */
    public final C60887da f93907d;

    /* renamed from: e */
    public Uri f93908e;

    /* renamed from: f */
    public Slice f93909f;

    /* renamed from: g */
    private final C4114m f93910g;

    /* renamed from: h */
    private C4113l f93911h;

    public C35835ax(Context context, C60887da daVar, C4114m mVar, String str) {
        this.f93905b = context;
        this.f93906c = str;
        this.f93907d = daVar;
        this.f93910g = mVar;
    }

    /* renamed from: a */
    public final void mo39860a() {
        Uri uri;
        C4113l lVar;
        C58976aa aaVar = C58975e.f156826a;
        C4114m mVar = this.f93910g;
        if (mVar != null && (uri = this.f93908e) != null && (lVar = this.f93911h) != null) {
            mVar.mo8630e(uri, lVar);
        }
    }

    /* renamed from: b */
    public final boolean mo39861b() {
        C58976aa aaVar = C58975e.f156826a;
        Boolean[] boolArr = new Boolean[1];
        C35834aw awVar = new C35834aw(this, boolArr);
        this.f93911h = awVar;
        try {
            this.f93910g.mo8628c(this.f93908e, awVar);
            this.f93911h.mo8625a(this.f93910g.mo8626a(this.f93908e));
            return boolArr[0].booleanValue();
        } catch (Resources.NotFoundException | IllegalArgumentException | NullPointerException | SecurityException e) {
            C59104x d = f93904a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SettingSlicesReaderImpl");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(51963)).mo56386p("Can't access slice URI.");
            mo39860a();
            return false;
        }
    }
}
