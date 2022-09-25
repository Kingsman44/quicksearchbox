package com.google.android.apps.gsa.shared.p7195y;

import android.content.ContentResolver;
import com.bumptech.glide.C5997p;
import com.bumptech.glide.load.C5637a;
import com.bumptech.glide.load.data.C5929d;
import com.bumptech.glide.load.data.C5930e;
import com.bumptech.glide.load.p297b.C5750ab;
import com.google.android.libraries.gsa.util.C23335a;
import com.google.common.p4526f.C59052c;
import dagger.C68214a;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.apps.gsa.shared.y.a */
/* compiled from: PG */
final class C91168a implements C5930e {

    /* renamed from: a */
    private final C5750ab f254535a;

    /* renamed from: b */
    private final int f254536b;

    /* renamed from: c */
    private final C68214a f254537c;

    /* renamed from: d */
    private final C91201bf f254538d;

    /* renamed from: e */
    private InputStream f254539e;

    public C91168a(C5750ab abVar, int i, C68214a aVar, C91201bf bfVar) {
        this.f254535a = abVar;
        this.f254536b = i;
        this.f254537c = aVar;
        this.f254538d = bfVar;
    }

    /* renamed from: a */
    public final C5637a mo11921a() {
        return C5637a.REMOTE;
    }

    /* renamed from: b */
    public final Class mo11922b() {
        return InputStream.class;
    }

    /* renamed from: c */
    public final void mo11923c() {
    }

    /* renamed from: d */
    public final void mo11924d() {
        InputStream inputStream = this.f254539e;
        if (inputStream != null) {
            try {
                ((C91195b) inputStream).f254579a.close();
            } catch (IOException e) {
                ((C59052c) ((C59052c) ((C59052c) C91211c.f254597a.mo56226d()).mo56382g(e)).mo56372aa(10627)).mo56386p("Error in cleanup");
            } finally {
                this.f254539e = null;
            }
        }
    }

    /* renamed from: e */
    public final void mo11925e(C5997p pVar, C5929d dVar) {
        try {
            C91195b bVar = new C91195b(C23335a.m43765b((ContentResolver) this.f254537c.mo27525b(), this.f254538d.mo85473a(this.f254535a.mo12250c(), this.f254536b, true)));
            this.f254539e = bVar;
            dVar.mo12183f(bVar);
        } catch (IOException e) {
            dVar.mo12184g(e);
        }
    }
}
