package com.google.android.libraries.mdi.download.p2236d;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.mdi.download.C28736bn;
import com.google.android.libraries.mdi.download.C28737bo;
import com.google.android.libraries.mdi.download.C29328dl;
import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29099m;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29112z;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.io.IOException;

/* renamed from: com.google.android.libraries.mdi.download.d.ai */
/* compiled from: PG */
public final /* synthetic */ class C28826ai implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78308a;

    /* renamed from: b */
    public final /* synthetic */ C29328dl f78309b;

    /* renamed from: c */
    public final /* synthetic */ C29334dr f78310c;

    public /* synthetic */ C28826ai(C29117fe feVar, C29328dl dlVar, C29334dr drVar) {
        this.f78308a = feVar;
        this.f78309b = dlVar;
        this.f78310c = drVar;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78308a;
        Uri uri = (Uri) obj;
        Uri b = C29099m.m54006b(feVar.f78972a, feVar.f78981j, this.f78309b, this.f78310c);
        try {
            Uri parse = Uri.parse(b.toString().substring(0, b.toString().lastIndexOf("/")));
            if (!feVar.f78978g.mo45894h(parse)) {
                feVar.f78978g.mo45890d(parse);
            }
            Context context = feVar.f78972a;
            uri.getClass();
            C29112z.m54047b(context, b, uri);
            return C60866ct.f164955a;
        } catch (IOException e) {
            C28736bn bnVar = new C28736bn();
            bnVar.f78062a = C28737bo.UNABLE_TO_CREATE_SYMLINK_STRUCTURE;
            bnVar.f78063b = "Unable to create symlink";
            bnVar.f78064c = e;
            return C60856cj.m92899h(bnVar.mo34334a());
        }
    }
}
