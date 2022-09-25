package com.google.android.apps.gsa.search.shared.p6930h;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import androidx.slice.C4110i;
import androidx.slice.C4113l;
import androidx.slice.C4114m;
import androidx.slice.C4121t;
import androidx.slice.Slice;
import androidx.slice.SliceItem;
import androidx.slice.p194a.C4094a;
import androidx.slice.widget.C4141as;
import androidx.slice.widget.C4147c;
import androidx.slice.widget.SliceView;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.libraries.logging.C28285c;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60321oe;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.shared.h.m */
/* compiled from: PG */
public final class C87570m implements C4141as {

    /* renamed from: a */
    public static final C59071e f236583a = C59071e.m91332i("com.google.android.apps.gsa.search.shared.h.m");

    /* renamed from: b */
    public final Context f236584b;

    /* renamed from: c */
    public Slice f236585c;

    /* renamed from: d */
    private final C4114m f236586d;

    /* renamed from: e */
    private boolean f236587e = false;

    /* renamed from: f */
    private final Uri f236588f;

    /* renamed from: g */
    private final C4113l f236589g;

    /* renamed from: h */
    private SliceView f236590h;

    public C87570m(Context context, String str, SliceView sliceView) {
        this.f236584b = context;
        C4121t tVar = new C4121t(context);
        this.f236586d = tVar;
        Uri parse = Uri.parse(str);
        this.f236588f = parse;
        C87569l lVar = new C87569l(this, sliceView);
        this.f236589g = lVar;
        try {
            tVar.mo8628c(parse, lVar);
            this.f236587e = true;
            Slice a = tVar.mo8626a(parse);
            this.f236585c = a;
            if (a == null) {
                ((C59052c) ((C59052c) f236583a.mo56226d()).mo56372aa(9801)).mo56386p("Failed to retrieve initial slice from slice URI.");
                tVar.mo8630e(parse, lVar);
                this.f236587e = false;
            } else if (sliceView != null) {
                ((C59052c) ((C59052c) f236583a.mo56224b()).mo56372aa(9800)).mo56386p("set initial sliceView.");
                sliceView.mo8671f(this.f236585c);
                this.f236590h = sliceView;
            }
        } catch (Resources.NotFoundException | IllegalArgumentException | NullPointerException | SecurityException e) {
            ((C59052c) ((C59052c) ((C59052c) f236583a.mo56225c()).mo56382g(e)).mo56372aa(9802)).mo56389s("Can't access slice URI: %s", e.getMessage());
            if (this.f236587e) {
                this.f236586d.mo8630e(this.f236588f, this.f236589g);
                this.f236587e = false;
            }
        }
    }

    /* renamed from: f */
    public static final C58833ax m142333f(C4110i iVar) {
        C58833ax axVar;
        if (iVar.mo8619h().isEmpty()) {
            axVar = C58836b.f156633a;
        } else {
            axVar = C58833ax.m90834k(true != ((C4094a) iVar.mo8619h().get(0)).f13111f ? "0" : "1");
        }
        if (axVar.mo56113h()) {
            ((C59052c) ((C59052c) f236583a.mo56224b()).mo56372aa(9798)).mo56389s("toggle value is :%s", axVar.mo56107c());
            return axVar;
        }
        int b = iVar.mo8613b();
        ((C59052c) ((C59052c) f236583a.mo56224b()).mo56372aa(9797)).mo56387q("range value is :%d", b);
        if (b == -1) {
            return C58836b.f156633a;
        }
        return C58833ax.m90834k(String.valueOf(b));
    }

    /* renamed from: a */
    public final void mo81690a() {
        if (!this.f236587e) {
            ((C59052c) ((C59052c) f236583a.mo56224b()).mo56372aa(9809)).mo56386p("classic setting slices api wrapper: skip unregister slice callback");
            return;
        }
        ((C59052c) ((C59052c) f236583a.mo56224b()).mo56372aa(9808)).mo56386p("classic setting slices api wrapper: unregister slice callback");
        this.f236586d.mo8630e(this.f236588f, this.f236589g);
        this.f236587e = false;
    }

    /* renamed from: b */
    public final void mo8726b(C4147c cVar, SliceItem sliceItem) {
        int i;
        SliceView sliceView = this.f236590h;
        if (sliceView != null) {
            int i2 = cVar.f13338b;
            if (i2 == 0) {
                i = 4;
            } else if (i2 == 2) {
                i = 31;
            } else {
                return;
            }
            C60321oe i3 = C28285c.m52882i(sliceView, i, (Integer) null);
            if (i3 != null) {
                int i4 = cVar.f13338b;
                C89949q.m146521e(i3, false);
            }
        }
    }

    /* renamed from: c */
    public final boolean mo81691c(PendingIntent pendingIntent, Intent intent) {
        try {
            pendingIntent.send(this.f236584b, 0, intent);
            return true;
        } catch (Exception e) {
            ((C59052c) ((C59052c) f236583a.mo56226d()).mo56372aa(9810)).mo56389s("Intent was canceled: %s", e.getMessage());
            return false;
        }
    }

    /* renamed from: d */
    public final boolean mo81692d() {
        return this.f236585c != null;
    }

    /* renamed from: e */
    public final boolean mo81693e(boolean z) {
        List h = new C4110i(this.f236584b, this.f236585c).mo8619h();
        if (h.isEmpty()) {
            return false;
        }
        return mo81691c(((C4094a) h.get(0)).mo8605b(), new Intent().putExtra("android.app.slice.extra.TOGGLE_STATE", z));
    }
}
