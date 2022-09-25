package com.google.android.libraries.search.assistant.p2828y.p2853n;

import android.support.p031v4.media.MediaMetadataCompat;
import android.support.p031v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.assistant.p3897e.p3917i.p3918a.C51445hz;
import com.google.assistant.p3897e.p3917i.p3918a.C51447ia;
import com.google.assistant.p3897e.p3921j.C52563wj;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.common.base.C58817ah;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.y.n.e */
/* compiled from: PG */
public final /* synthetic */ class C37008e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C51445hz f96376a;

    /* renamed from: b */
    public final /* synthetic */ MediaMetadataCompat f96377b;

    /* renamed from: c */
    public final /* synthetic */ PlaybackStateCompat f96378c;

    public /* synthetic */ C37008e(C51445hz hzVar, MediaMetadataCompat mediaMetadataCompat, PlaybackStateCompat playbackStateCompat) {
        this.f96376a = hzVar;
        this.f96377b = mediaMetadataCompat;
        this.f96378c = playbackStateCompat;
    }

    public final Object apply(Object obj) {
        Optional optional;
        C51445hz hzVar = this.f96376a;
        MediaMetadataCompat mediaMetadataCompat = this.f96377b;
        PlaybackStateCompat playbackStateCompat = this.f96378c;
        if (((C46108a) obj).mo50210b().f121165j.equals("pseudonymous")) {
            return Optional.m71637of((C51447ia) hzVar.build());
        }
        String f = mediaMetadataCompat.mo821f("android.media.metadata.TITLE");
        String f2 = mediaMetadataCompat.mo821f("android.media.metadata.ARTIST");
        String f3 = mediaMetadataCompat.mo821f("android.media.metadata.ALBUM");
        String f4 = mediaMetadataCompat.mo821f("android.media.metadata.DISPLAY_DESCRIPTION");
        if (!TextUtils.isEmpty(f) || !TextUtils.isEmpty(f2) || !TextUtils.isEmpty(f3) || !TextUtils.isEmpty(f4)) {
            C52563wj wjVar = (C52563wj) C52568wo.f137992v.createBuilder();
            if (!TextUtils.isEmpty(f)) {
                wjVar.copyOnWrite();
                C52568wo woVar = (C52568wo) wjVar.instance;
                f.getClass();
                woVar.f137994a |= 1;
                woVar.f137998e = f;
            }
            if (!TextUtils.isEmpty(f2)) {
                wjVar.copyOnWrite();
                C52568wo woVar2 = (C52568wo) wjVar.instance;
                f2.getClass();
                woVar2.f137994a |= 2;
                woVar2.f137999f = f2;
            }
            if (!TextUtils.isEmpty(f3)) {
                wjVar.copyOnWrite();
                C52568wo woVar3 = (C52568wo) wjVar.instance;
                f3.getClass();
                woVar3.f137994a |= 8;
                woVar3.f138000g = f3;
            }
            if (!TextUtils.isEmpty(f4)) {
                wjVar.copyOnWrite();
                C52568wo woVar4 = (C52568wo) wjVar.instance;
                f4.getClass();
                woVar4.f137994a |= 32;
                woVar4.f138002i = f4;
            }
            optional = Optional.m71637of((C52568wo) wjVar.build());
        } else {
            optional = Optional.empty();
        }
        Objects.requireNonNull(hzVar);
        optional.ifPresent(new C37012i(hzVar));
        long j = playbackStateCompat.f995b;
        hzVar.copyOnWrite();
        C51447ia iaVar = (C51447ia) hzVar.instance;
        C51447ia iaVar2 = C51447ia.f133979i;
        iaVar.f133981a |= 64;
        iaVar.f133987g = j;
        return Optional.m71637of((C51447ia) hzVar.build());
    }
}
