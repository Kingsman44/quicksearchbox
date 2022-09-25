package com.google.android.apps.search.googleapp.discover.settings.p10221e;

import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58817ah;
import com.google.p395al.p417d.p418a.C8590q;
import p5462h.C69677g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.settings.e.a */
/* compiled from: PG */
final class C134671a implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ C134674b f366730a;

    public C134671a(C134674b bVar) {
        this.f366730a = bVar;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C8590q qVar = (C8590q) obj;
        C134674b bVar = this.f366730a;
        C69664n.m101060f(qVar, "preference");
        C8590q qVar2 = C8590q.AUTOPLAY_UNSPECIFIED;
        int ordinal = qVar.ordinal();
        if (ordinal == 0) {
            String string = bVar.f366735a.getResources().getString(R.string.googleapp_autoplay_video_previews_never);
            C69664n.m101060f(string, "context.resources.getStr…lay_video_previews_never)");
            return string;
        } else if (ordinal == 1) {
            String string2 = bVar.f366735a.getResources().getString(R.string.googleapp_autoplay_video_previews_never);
            C69664n.m101060f(string2, "context.resources.getStr…lay_video_previews_never)");
            return string2;
        } else if (ordinal == 2) {
            String string3 = bVar.f366735a.getResources().getString(R.string.googleapp_autoplay_video_previews_wifi);
            C69664n.m101060f(string3, "context.resources.getStr…play_video_previews_wifi)");
            return string3;
        } else if (ordinal == 3) {
            String string4 = bVar.f366735a.getResources().getString(R.string.googleapp_autoplay_video_previews_always);
            C69664n.m101060f(string4, "context.resources.getStr…ay_video_previews_always)");
            return string4;
        } else {
            throw new C69677g();
        }
    }
}
