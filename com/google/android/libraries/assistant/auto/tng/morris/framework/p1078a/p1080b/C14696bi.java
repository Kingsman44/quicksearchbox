package com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import androidx.slice.C4113l;
import androidx.slice.C4114m;
import androidx.slice.Slice;
import androidx.slice.SliceItem;
import androidx.slice.widget.C4141as;
import androidx.slice.widget.C4147c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.bi */
/* compiled from: PG */
public final class C14696bi implements C4141as {

    /* renamed from: a */
    public static final C59071e f44402a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.bi");

    /* renamed from: b */
    public final Context f44403b;

    /* renamed from: c */
    public Slice f44404c;

    /* renamed from: d */
    private final C4114m f44405d;

    /* renamed from: e */
    private boolean f44406e = false;

    /* renamed from: f */
    private final Uri f44407f;

    /* renamed from: g */
    private final C4113l f44408g;

    public C14696bi(Context context, String str, C4114m mVar) {
        this.f44403b = context;
        this.f44405d = mVar;
        Uri parse = Uri.parse(str);
        this.f44407f = parse;
        C14695bh bhVar = new C14695bh(this);
        this.f44408g = bhVar;
        try {
            mVar.mo8628c(parse, bhVar);
            this.f44406e = true;
            Slice a = mVar.mo8626a(parse);
            this.f44404c = a;
            if (a == null) {
                ((C59052c) ((C59052c) f44402a.mo56226d()).mo56372aa(45436)).mo56386p("Failed to retrieve initial slice from slice URI.");
                mVar.mo8630e(parse, bhVar);
                this.f44406e = false;
            }
        } catch (Resources.NotFoundException | IllegalArgumentException | NullPointerException | SecurityException e) {
            ((C59052c) ((C59052c) ((C59052c) f44402a.mo56225c()).mo56382g(e)).mo56372aa(45437)).mo56389s("Can't access slice URI: %s", e.getMessage());
            if (this.f44406e) {
                this.f44405d.mo8630e(this.f44407f, this.f44408g);
                this.f44406e = false;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo21668a() {
        return this.f44404c != null;
    }

    /* renamed from: b */
    public final void mo8726b(C4147c cVar, SliceItem sliceItem) {
    }
}
