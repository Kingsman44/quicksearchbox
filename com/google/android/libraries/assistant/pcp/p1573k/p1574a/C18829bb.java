package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import android.net.Uri;
import android.support.p031v4.media.C0282s;
import android.support.p031v4.media.MediaBrowserCompat;
import android.support.p031v4.media.MediaDescriptionCompat;
import android.text.TextUtils;
import androidx.p104d.p105a.C2164c;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.pcp.p1573k.C18931k;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p3186j$.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.bb */
/* compiled from: PG */
final class C18829bb extends C0282s {

    /* renamed from: d */
    final /* synthetic */ C2164c f53029d;

    /* renamed from: e */
    final /* synthetic */ C18832be f53030e;

    public C18829bb(C18832be beVar, C2164c cVar) {
        this.f53030e = beVar;
        this.f53029d = cVar;
    }

    /* renamed from: a */
    public final void mo856a(String str, List list) {
        String str2;
        CharSequence charSequence;
        C18832be beVar = this.f53030e;
        C2164c cVar = this.f53029d;
        if (!beVar.f53039b.mo805i()) {
            ((C59052c) ((C59052c) C18832be.f53038a.mo56226d()).mo56372aa(47435)).mo56389s("Media browser not available from %s.", beVar.f53040c);
            beVar.mo24189f(cVar, 4, "Media browser not available.");
            return;
        }
        if (beVar.f53048k) {
            ((C59052c) ((C59052c) C18832be.f53038a.mo56224b()).mo56372aa(47434)).mo56389s("#onChildrenLoaded() Callback received, unsubscribing from parent ID {%s}", str);
            if (beVar.f53046i.remove(str) != null && !str.isEmpty()) {
                beVar.mo24186c(str);
            }
        }
        if (!str.equals(beVar.f53055r.orElse(BuildConfig.FLAVOR)) || !list.isEmpty()) {
            ((C59052c) ((C59052c) C18832be.f53038a.mo56224b()).mo56372aa(47430)).mo56359L("#onChildrenLoaded() Parent id: {%s} children size %d for %s.", str, Integer.valueOf(list.size()), beVar.f53040c);
            beVar.f53040c.getPackageName().contains("spotify");
            str.equals("com.google.android.googlequicksearchbox---spotify:space_item:partner-recommendations:partner-recently-played-v2");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MediaBrowserCompat.MediaItem mediaItem = (MediaBrowserCompat.MediaItem) it.next();
                if (((long) beVar.f53043f.size()) >= beVar.f53049l && !beVar.f53050m) {
                    ((C59052c) ((C59052c) C18832be.f53038a.mo56224b()).mo56372aa(47432)).mo56389s("#onChildrenLoaded() Disconnecting because we have enough media items from %s", beVar.f53040c);
                    beVar.mo24189f(cVar, 16, "Early exit due to enough items loaded.");
                    return;
                } else if (!(mediaItem == null || (str2 = mediaItem.f930b.f932a) == null)) {
                    if (mediaItem.mo808c()) {
                        if (!C18931k.m36393a(beVar.f53040c, mediaItem)) {
                            String str3 = mediaItem.f930b.f932a;
                        } else {
                            Uri uri = mediaItem.f930b.f937f;
                            boolean z = uri != null && !uri.toString().isEmpty();
                            MediaDescriptionCompat mediaDescriptionCompat = mediaItem.f930b;
                            boolean z2 = mediaDescriptionCompat.f936e != null;
                            Object[] objArr = new Object[5];
                            objArr[0] = mediaDescriptionCompat.f932a;
                            objArr[1] = mediaDescriptionCompat.f933b;
                            objArr[2] = z ? mediaDescriptionCompat.f937f : "NULL";
                            objArr[3] = Boolean.valueOf(z2);
                            objArr[4] = beVar.f53040c;
                            String.format("Item (ID: %s, title: %s, icon URI: %s, hasBitmap: %b) from %s", objArr);
                            if (!beVar.f53043f.containsKey(mediaItem.f930b.f932a)) {
                                if (beVar.f53050m) {
                                    C58485gu guVar = beVar.f53041d;
                                    if (!guVar.contains(str) && !guVar.contains(ConcurrentMap.EL.getOrDefault(beVar.f53044g, str, BuildConfig.FLAVOR)) && !guVar.contains("ANY_FOLDER")) {
                                    }
                                }
                                ConcurrentHashMap concurrentHashMap = beVar.f53045h;
                                String str4 = mediaItem.f930b.f932a;
                                str4.getClass();
                                concurrentHashMap.putIfAbsent(str4, str);
                                Map map = beVar.f53043f;
                                String str5 = mediaItem.f930b.f932a;
                                str5.getClass();
                                map.put(str5, mediaItem);
                            }
                        }
                    } else if (TextUtils.isEmpty(str2)) {
                        ((C59052c) ((C59052c) C18832be.f53038a.mo56226d()).mo56372aa(47429)).mo56354G("Media item has empty mediaId with parentId %s and component %s.", str, beVar.f53040c);
                    } else {
                        MediaDescriptionCompat mediaDescriptionCompat2 = mediaItem.f930b;
                        String obj = (mediaDescriptionCompat2 == null || (charSequence = mediaDescriptionCompat2.f933b) == null) ? BuildConfig.FLAVOR : charSequence.toString();
                        ConcurrentHashMap concurrentHashMap2 = beVar.f53044g;
                        String str6 = mediaItem.f930b.f932a;
                        str6.getClass();
                        concurrentHashMap2.putIfAbsent(str6, obj);
                        if (!beVar.f53050m || beVar.f53041d.contains(obj) || beVar.f53041d.contains(mediaItem.f930b.f932a) || beVar.f53041d.contains("ANY_FOLDER")) {
                            C0282s a = beVar.mo24184a(cVar);
                            try {
                                MediaBrowserCompat mediaBrowserCompat = beVar.f53039b;
                                String str7 = mediaItem.f930b.f932a;
                                str7.getClass();
                                mediaBrowserCompat.mo803g(str7, a);
                                ConcurrentHashMap concurrentHashMap3 = beVar.f53046i;
                                String str8 = mediaItem.f930b.f932a;
                                str8.getClass();
                                concurrentHashMap3.put(str8, true);
                            } catch (RuntimeException e) {
                                ((C59052c) ((C59052c) ((C59052c) C18832be.f53038a.mo56225c()).mo56382g(e)).mo56372aa(47427)).mo56389s("#onChildrenLoaded() Failed to subscribe media id %s", mediaItem.f930b.f932a);
                            }
                        }
                        String str9 = mediaItem.f930b.f932a;
                    }
                }
            }
            beVar.mo24185b(cVar);
            if (!beVar.f53046i.isEmpty()) {
                beVar.f53052o.ifPresent(C18822av.f53015a);
                if (!beVar.f53047j.isZero()) {
                    beVar.f53052o = Optional.m71637of(beVar.f53042e.mo29165e(new C18823aw(beVar, cVar), beVar.f53047j.toMillis(), TimeUnit.MILLISECONDS));
                    return;
                }
                return;
            }
            return;
        }
        ((C59052c) ((C59052c) C18832be.f53038a.mo56226d()).mo56372aa(47433)).mo56389s("No children media available from root id {%s}.", str);
        beVar.mo24189f(cVar, 7, "No children media available.");
    }

    /* renamed from: b */
    public final void mo857b(String str) {
        C18832be beVar = this.f53030e;
        C2164c cVar = this.f53029d;
        ((C59052c) ((C59052c) C18832be.f53038a.mo56225c()).mo56372aa(47436)).mo56386p("On device media item subscription callback returns error.");
        if (beVar.f53046i.remove(str) != null) {
            beVar.mo24186c(str);
        }
        if (str.equals(beVar.f53055r.orElse(BuildConfig.FLAVOR))) {
            ((C59052c) ((C59052c) C18832be.f53038a.mo56224b()).mo56372aa(47437)).mo56389s("Root node subscription got onError callback for %s", beVar.f53040c);
            beVar.mo24189f(cVar, 18, "Root node subscription got onError callback.");
            return;
        }
        beVar.mo24185b(cVar);
    }
}
