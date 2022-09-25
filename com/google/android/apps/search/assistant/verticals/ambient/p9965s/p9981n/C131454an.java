package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9981n;

import android.content.Context;
import androidx.slice.C4114m;
import androidx.slice.SliceItem;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.p10016j.C131757a;
import java.util.Arrays;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.n.an */
/* compiled from: PG */
public final class C131454an {

    /* renamed from: a */
    public final Context f359282a;

    /* renamed from: b */
    public final C4114m f359283b;

    /* renamed from: c */
    public final C131757a f359284c;

    public C131454an(C130603a aVar, Context context, C4114m mVar, C131757a aVar2) {
        aVar.mo109740b(this);
        this.f359282a = context;
        this.f359283b = mVar;
        this.f359284c = aVar2;
    }

    /* renamed from: a */
    public static Optional m213898a(SliceItem sliceItem) {
        if (!sliceItem.f13092b.equals("slice")) {
            return Optional.empty();
        }
        return Collection.EL.stream(Arrays.asList(sliceItem.mo8596d().f13088d)).filter(C131449ai.f359277a).map(C131450aj.f359278a).map(C131451ak.f359279a).filter(C131452al.f359280a).findFirst();
    }
}
