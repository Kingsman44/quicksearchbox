package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8259c;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.net.Uri;
import com.google.assistant.p3897e.p3902c.p3907c.C51011db;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51055es;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51097gg;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52559wf;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.assistant.p3897e.p3921j.C52563wj;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protobuf.C63087y;
import com.google.protobuf.C63088z;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.c.y */
/* compiled from: PG */
public final /* synthetic */ class C106971y implements Function {

    /* renamed from: a */
    public final /* synthetic */ C106867ab f297961a;

    public /* synthetic */ C106971y(C106867ab abVar) {
        this.f297961a = abVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C106867ab abVar = this.f297961a;
        MediaController mediaController = (MediaController) obj;
        if (C58837ba.m90859h(mediaController.getPackageName())) {
            ((C58970a) ((C58970a) abVar.f297762b.mo56225c()).mo56372aa(23368)).mo56386p("mediaController has no package name.");
            return Optional.empty();
        }
        ((C58970a) ((C58970a) abVar.f297762b.mo56224b()).mo56372aa(23357)).mo56389s("mediaController: %s", mediaController.getPackageName());
        PlaybackState playbackState = mediaController.getPlaybackState();
        if (playbackState == null) {
            ((C58970a) ((C58970a) abVar.f297762b.mo56226d()).mo56372aa(23367)).mo56389s("mediaController(%s) has no playbackState", mediaController.getPackageName());
            return Optional.empty();
        }
        MediaMetadata metadata = mediaController.getMetadata();
        if (metadata == null) {
            ((C58970a) ((C58970a) abVar.f297762b.mo56226d()).mo56372aa(23366)).mo56389s("mediaController(%s) has no metadata.", mediaController.getPackageName());
            return Optional.empty();
        } else if (metadata.keySet().isEmpty()) {
            ((C58970a) ((C58970a) abVar.f297762b.mo56226d()).mo56372aa(23365)).mo56389s("mediaController(%s) metadata has no keys.", mediaController.getPackageName());
            return Optional.empty();
        } else {
            ((C58970a) ((C58970a) abVar.f297762b.mo56224b()).mo56372aa(23358)).mo56389s("keySet(%s):", mediaController.getPackageName());
            for (String next : metadata.keySet()) {
                ((C58970a) ((C58970a) abVar.f297762b.mo56224b()).mo56372aa(23364)).mo56354G("  %s: %s", next, metadata.getString(next));
            }
            MediaDescription description = metadata.getDescription();
            Bitmap iconBitmap = description.getIconBitmap();
            Uri iconUri = description.getIconUri();
            if (iconBitmap != null || (iconUri != null && !iconUri.toString().isEmpty())) {
                String mediaId = description.getMediaId();
                if (C58837ba.m90859h(mediaId)) {
                    mediaId = metadata.getString("android.media.metadata.MEDIA_ID");
                    if (C58837ba.m90859h(mediaId)) {
                        ((C58970a) ((C58970a) abVar.f297762b.mo56224b()).mo56372aa(23362)).mo56389s("mediaController(%s) has no mediaId.", mediaController.getPackageName());
                    }
                }
                ((C58970a) ((C58970a) abVar.f297762b.mo56224b()).mo56372aa(23359)).mo56354G("mediaController(%s) mediaId: %s", mediaController.getPackageName(), mediaId);
                C52559wf wfVar = (C52559wf) C52560wg.f137943j.createBuilder();
                C51097gg ggVar = (C51097gg) C51098gh.f133009e.createBuilder();
                C51055es esVar = (C51055es) C51058ev.f132941o.createBuilder();
                String packageName = mediaController.getPackageName();
                esVar.copyOnWrite();
                C51058ev evVar = (C51058ev) esVar.instance;
                packageName.getClass();
                evVar.f132943a |= 1;
                evVar.f132944b = packageName;
                ggVar.copyOnWrite();
                C51098gh ghVar = (C51098gh) ggVar.instance;
                C51058ev evVar2 = (C51058ev) esVar.build();
                evVar2.getClass();
                ghVar.f133013c = evVar2;
                ghVar.f133012b = 1;
                wfVar.copyOnWrite();
                C52560wg wgVar = (C52560wg) wfVar.instance;
                C51098gh ghVar2 = (C51098gh) ggVar.build();
                ghVar2.getClass();
                wgVar.f137949e = ghVar2;
                wgVar.f137945a |= 4;
                if (mediaId != null) {
                    wfVar.copyOnWrite();
                    C52560wg wgVar2 = (C52560wg) wfVar.instance;
                    wgVar2.f137945a |= 64;
                    wgVar2.f137952h = mediaId;
                }
                C52563wj wjVar = (C52563wj) C52568wo.f137992v.createBuilder();
                long actions = playbackState.getActions();
                wjVar.copyOnWrite();
                C52568wo woVar = (C52568wo) wjVar.instance;
                woVar.f137995b |= 2;
                woVar.f138012s = actions;
                long lastPositionUpdateTime = playbackState.getLastPositionUpdateTime();
                wjVar.copyOnWrite();
                C52568wo woVar2 = (C52568wo) wjVar.instance;
                woVar2.f137995b |= 4;
                woVar2.f138013t = lastPositionUpdateTime;
                CharSequence title = description.getTitle();
                if (title != null) {
                    String obj2 = title.toString();
                    wjVar.copyOnWrite();
                    C52568wo woVar3 = (C52568wo) wjVar.instance;
                    obj2.getClass();
                    woVar3.f137994a |= 1;
                    woVar3.f137998e = obj2;
                }
                String string = metadata.getString("android.media.metadata.ARTIST");
                if (string != null) {
                    wjVar.copyOnWrite();
                    C52568wo woVar4 = (C52568wo) wjVar.instance;
                    woVar4.f137994a |= 2;
                    woVar4.f137999f = string;
                }
                C51011db dbVar = (C51011db) C51012dc.f132813k.createBuilder();
                if (iconBitmap != null) {
                    ((C58970a) ((C58970a) abVar.f297762b.mo56224b()).mo56372aa(23361)).mo56386p("Metadata already contains album art.");
                    C63087y v = C63088z.m96150v();
                    iconBitmap.compress(Bitmap.CompressFormat.PNG, 100, v);
                    C63088z b = v.mo59165b();
                    dbVar.copyOnWrite();
                    C51012dc dcVar = (C51012dc) dbVar.instance;
                    b.getClass();
                    dcVar.f132815a |= 8;
                    dcVar.f132819e = b;
                }
                if (iconUri != null) {
                    ((C58970a) ((C58970a) abVar.f297762b.mo56224b()).mo56372aa(23360)).mo56389s("Setting Image.SourceUrl: %s", iconUri);
                    String uri = iconUri.toString();
                    dbVar.copyOnWrite();
                    C51012dc dcVar2 = (C51012dc) dbVar.instance;
                    uri.getClass();
                    dcVar2.f132815a |= 2;
                    dcVar2.f132817c = uri;
                }
                wjVar.copyOnWrite();
                C52568wo woVar5 = (C52568wo) wjVar.instance;
                C51012dc dcVar3 = (C51012dc) dbVar.build();
                dcVar3.getClass();
                woVar5.f138004k = dcVar3;
                woVar5.f137994a |= 1024;
                wfVar.copyOnWrite();
                C52560wg wgVar3 = (C52560wg) wfVar.instance;
                C52568wo woVar6 = (C52568wo) wjVar.build();
                woVar6.getClass();
                wgVar3.f137950f = woVar6;
                wgVar3.f137945a |= 8;
                return Optional.m71637of((C52560wg) wfVar.build());
            }
            ((C58970a) ((C58970a) abVar.f297762b.mo56226d()).mo56372aa(23363)).mo56389s("mediaController(%s) has no album art.", mediaController.getPackageName());
            return Optional.empty();
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
