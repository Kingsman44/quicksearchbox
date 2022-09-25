package com.google.apps.tiktok.p3648i.p3652c;

import android.content.Context;
import androidx.p186q.p187a.C4051f;
import androidx.p186q.p187a.C4052g;
import androidx.p186q.p187a.C4054i;
import androidx.p186q.p187a.p188a.C4044m;
import com.google.common.base.C58881cr;
import java.io.File;

/* renamed from: com.google.apps.tiktok.i.c.e */
/* compiled from: PG */
public final /* synthetic */ class C47171e implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C47172f f122824a;

    public /* synthetic */ C47171e(C47172f fVar) {
        this.f122824a = fVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        C47172f fVar = this.f122824a;
        try {
            String path = ((File) fVar.f122826b.call()).getPath();
            path.getClass();
            C4044m mVar = fVar.f122828d;
            Context context = fVar.f122825a;
            C4052g gVar = fVar.f122827c;
            C4054i a = mVar.mo8302a(C4051f.m11601a(context, path, gVar.f12937c, gVar.f12938d, gVar.f12939e));
            a.mo8210c(true);
            return a;
        } catch (Exception e) {
            throw e;
        }
    }
}
