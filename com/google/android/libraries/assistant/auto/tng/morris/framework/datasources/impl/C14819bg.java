package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import android.content.ComponentName;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.p031v4.media.C0282s;
import android.support.p031v4.media.MediaBrowserCompat;
import android.support.p031v4.media.MediaDescriptionCompat;
import android.text.TextUtils;
import androidx.p104d.p105a.C2164c;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14216b;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14290dt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14292dv;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14309el;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14361gj;
import com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15375c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.bg */
/* compiled from: PG */
final class C14819bg extends C0282s {

    /* renamed from: d */
    final /* synthetic */ String f44624d;

    /* renamed from: e */
    final /* synthetic */ ComponentName f44625e;

    /* renamed from: f */
    final /* synthetic */ C2164c f44626f;

    /* renamed from: g */
    final /* synthetic */ C14820bh f44627g;

    public C14819bg(C14820bh bhVar, String str, ComponentName componentName, C2164c cVar) {
        this.f44627g = bhVar;
        this.f44624d = str;
        this.f44625e = componentName;
        this.f44626f = cVar;
    }

    /* renamed from: a */
    public final void mo856a(String str, List list) {
        Optional optional;
        CharSequence charSequence;
        C59104x b = C14820bh.f44628a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Morris.MedBTDataSrc");
        ((C59052c) ((C59052c) b).mo56372aa(45551)).mo56395y("Loaded %d children for %s,", list.size(), str);
        C59104x b2 = C14820bh.f44628a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "Morris.MedBTDataSrc");
        ((C59052c) ((C59052c) b2).mo56372aa(45552)).mo56354G("current subscribed mediaId %s, loaded items' parentId: %s", this.f44624d, str);
        if (str.equals(this.f44624d)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MediaBrowserCompat.MediaItem mediaItem = (MediaBrowserCompat.MediaItem) it.next();
                if (mediaItem != null) {
                    C14820bh bhVar = this.f44627g;
                    ComponentName componentName = this.f44625e;
                    if (mediaItem.f930b.f932a == null) {
                        optional = Optional.empty();
                    } else {
                        C14290dt dtVar = (C14290dt) C14292dv.f43233q.createBuilder();
                        C14216b a = bhVar.f44634g.mo22212a(componentName.getPackageName(), componentName.getClassName());
                        dtVar.copyOnWrite();
                        a.getClass();
                        ((C14292dv) dtVar.instance).f43239e = a;
                        String str2 = mediaItem.f930b.f932a;
                        str2.getClass();
                        dtVar.copyOnWrite();
                        ((C14292dv) dtVar.instance).f43243i = str2;
                        MediaDescriptionCompat mediaDescriptionCompat = mediaItem.f930b;
                        if (mediaDescriptionCompat != null) {
                            charSequence = mediaDescriptionCompat.f933b;
                            Bitmap bitmap = mediaDescriptionCompat.f936e;
                            if (bitmap != null) {
                                C14361gj c = C15375c.m31985c(bitmap);
                                if (c != null) {
                                    dtVar.copyOnWrite();
                                    C14292dv dvVar = (C14292dv) dtVar.instance;
                                    dvVar.f43238d = c;
                                    dvVar.f43237c = 15;
                                }
                            } else {
                                Uri uri = mediaDescriptionCompat.f937f;
                                if (uri != null) {
                                    String uri2 = uri.toString();
                                    dtVar.copyOnWrite();
                                    C14292dv dvVar2 = (C14292dv) dtVar.instance;
                                    uri2.getClass();
                                    dvVar2.f43237c = 14;
                                    dvVar2.f43238d = uri2;
                                }
                            }
                            CharSequence charSequence2 = mediaDescriptionCompat.f934c;
                            if (charSequence2 != null) {
                                String obj = charSequence2.toString();
                                dtVar.copyOnWrite();
                                obj.getClass();
                                ((C14292dv) dtVar.instance).f43242h = obj;
                            }
                        } else {
                            charSequence = null;
                        }
                        if (TextUtils.isEmpty(charSequence)) {
                            C59104x d = C14820bh.f44628a.mo56226d();
                            d.mo56378ag(C58975e.f156826a, "Morris.MedBTDataSrc");
                            ((C59052c) ((C59052c) d).mo56372aa(45561)).mo56389s("Browse menu item has null or empty title, mediaId: (%s).", mediaItem.f930b.f932a);
                            dtVar.copyOnWrite();
                            ((C14292dv) dtVar.instance).f43241g = BuildConfig.FLAVOR;
                        } else {
                            String obj2 = charSequence.toString();
                            dtVar.copyOnWrite();
                            obj2.getClass();
                            ((C14292dv) dtVar.instance).f43241g = obj2;
                        }
                        int i = true != mediaItem.mo808c() ? 4 : 3;
                        dtVar.copyOnWrite();
                        ((C14292dv) dtVar.instance).f43250p = i - 2;
                        optional = Optional.m71637of((C14292dv) dtVar.build());
                    }
                    if (optional.isPresent()) {
                        optional.get();
                        arrayList.add((C14292dv) optional.get());
                    }
                }
            }
            this.f44627g.f44635h.set(arrayList);
            this.f44626f.mo5437b(C14309el.MEDIA_BROWSE_SUBSCRIPTION_SUCCESS);
        }
    }

    /* renamed from: b */
    public final void mo857b(String str) {
        this.f44626f.mo5437b(C14309el.MEDIA_BROWSE_SUBSCRIPTION_ON_ERROR);
        C59104x d = C14820bh.f44628a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "Morris.MedBTDataSrc");
        ((C59052c) ((C59052c) d).mo56372aa(45554)).mo56354G("Subscription callback error for parentId: %s, current subscribed mediaId %s", str, this.f44624d);
    }
}
