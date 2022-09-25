package com.google.android.libraries.search.assistant.notification.p2711b;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.provider.ContactsContract;
import android.service.notification.StatusBarNotification;
import android.telephony.PhoneNumberUtils;
import android.util.Patterns;
import android.view.SurfaceHolder;
import androidx.core.app.C1787ad;
import androidx.core.app.C1788ae;
import androidx.core.app.C1791ah;
import androidx.core.app.C1803at;
import androidx.core.app.C1811ba;
import androidx.core.app.C1832s;
import androidx.core.graphics.drawable.C1932e;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.libraries.search.assistant.notification.data.AutoValue_MessageNotification_Actions;
import com.google.android.libraries.search.assistant.notification.data.C34881b;
import com.google.android.libraries.search.assistant.notification.data.C34883d;
import com.google.android.libraries.search.assistant.notification.data.C34891l;
import com.google.android.libraries.search.assistant.notification.p2712c.C34867a;
import com.google.android.libraries.search.assistant.notification.p2712c.C34869c;
import com.google.android.libraries.search.assistant.notification.p2712c.C34870d;
import com.google.android.libraries.search.assistant.notification.p2712c.C34871e;
import com.google.android.libraries.search.assistant.performer.permissions.C36196a;
import com.google.apps.tiktok.p3624b.C46356a;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.notification.b.n */
/* compiled from: PG */
public final class C34866n {

    /* renamed from: a */
    public static final Pattern f92462a = Pattern.compile("[☀-⟿]|[🀀-𠏿]");

    /* renamed from: b */
    public final Executor f92463b;

    /* renamed from: c */
    private final C34870d f92464c;

    public C34866n(C34870d dVar, Executor executor) {
        this.f92464c = dVar;
        this.f92463b = executor;
    }

    /* renamed from: a */
    public static RemoteInput m63622a(C1811ba baVar) {
        RemoteInput.Builder addExtras = new RemoteInput.Builder(baVar.f5636a).setLabel(baVar.f5637b).setChoices(baVar.f5638c).setAllowFreeFormInput(baVar.f5639d).addExtras(baVar.f5641f);
        addExtras.setEditChoicesBeforeSending(baVar.f5640e);
        return addExtras.build();
    }

    /* renamed from: b */
    public static Icon m63623b(C1788ae aeVar, Context context) {
        if (!aeVar.f5574a.isEmpty()) {
            C1803at atVar = ((C1787ad) aeVar.f5574a.get(0)).f5570c;
            IconCompat iconCompat = atVar != null ? atVar.f5631b : null;
            if (iconCompat != null) {
                return C1932e.m5233b(iconCompat, context);
            }
        }
        return null;
    }

    /* renamed from: e */
    public static void m63624e(Notification notification, C1787ad adVar, Context context, C34891l lVar) {
        Icon largeIcon = notification.getLargeIcon();
        if (largeIcon == null) {
            C1803at atVar = adVar.f5570c;
            IconCompat iconCompat = atVar != null ? atVar.f5631b : null;
            if (iconCompat != null) {
                ((C34881b) lVar).f92526n = Optional.m71637of(C1932e.m5233b(iconCompat, context));
                return;
            }
            return;
        }
        ((C34881b) lVar).f92526n = Optional.m71637of(largeIcon);
    }

    /* renamed from: f */
    public static void m63625f(Context context, StatusBarNotification statusBarNotification, C34883d dVar) {
        String lastPathSegment;
        Notification notification = statusBarNotification.getNotification();
        String a = C34871e.m63635a(context, statusBarNotification.getPackageName());
        if (a != null) {
            dVar.mo39595g(a);
        }
        String str = notification.category;
        if (str != null) {
            dVar.mo39596h(str);
        }
        Uri uri = notification.sound;
        if (uri != null && ((lastPathSegment = uri.getLastPathSegment()) == null || !lastPathSegment.endsWith(".flac"))) {
            try {
                MediaPlayer create = MediaPlayer.create(context, uri, (SurfaceHolder) null, new AudioAttributes.Builder().setLegacyStreamType(3).build(), ((AudioManager) context.getSystemService("audio")).generateAudioSessionId());
                if (create != null) {
                    create.release();
                }
                if (create != null) {
                    dVar.mo39591c(notification.sound);
                }
            } catch (Exception unused) {
            }
        }
        boolean z = true;
        if (notification.getGroup() != null && (!C1791ah.m4935c(notification) ? notification.getGroupAlertBehavior() == 1 : notification.getGroupAlertBehavior() == 2)) {
            z = false;
        }
        dVar.mo39597i(z);
        dVar.mo39599k(statusBarNotification.getPackageName());
        dVar.mo39593e(Long.valueOf(statusBarNotification.getPostTime()));
        dVar.mo39598j(statusBarNotification.getKey());
    }

    /* renamed from: g */
    public static void m63626g(Notification notification, C34891l lVar) {
        Optional a = C34867a.m63629a(notification);
        Optional empty = Optional.empty();
        if (a.isPresent()) {
            empty = Optional.ofNullable(((C1832s) a.get()).f5662i);
        }
        Optional b = C34867a.m63630b(notification);
        Optional empty2 = Optional.empty();
        Optional empty3 = Optional.empty();
        if (b.isPresent()) {
            empty2 = Optional.ofNullable(((C1832s) b.get()).f5662i);
            Optional map = C34867a.m63631c((C1832s) b.get()).map(C34862j.f92458a);
            if (map.isPresent()) {
                empty3 = map;
            } else {
                C1811ba[] baVarArr = ((C1832s) b.get()).f5655b;
                if (baVarArr != null && baVarArr.length > 0) {
                    empty3 = Optional.m71637of(m63622a(baVarArr[0]));
                }
            }
        }
        ((C34881b) lVar).f92525m = Optional.m71637of(new AutoValue_MessageNotification_Actions(empty, empty2, empty3));
    }

    /* renamed from: c */
    public final C60870cx mo39536c(String str, String str2) {
        C60870cx d = mo39537d(str, str2);
        C34865m mVar = new C34865m(str);
        return C60922j.m93044g(d, C47810es.m84963c(mVar), this.f92463b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C60870cx mo39537d(String str, String str2) {
        C60870cx cxVar;
        Matcher matcher = Patterns.PHONE.matcher(str);
        if (!matcher.find()) {
            return C60856cj.m92900i(Optional.empty());
        }
        String formatNumber = PhoneNumberUtils.formatNumber(matcher.group(), Locale.getDefault().getCountry());
        if (formatNumber == null) {
            return C60856cj.m92900i(Optional.empty());
        }
        C34870d dVar = this.f92464c;
        if (!C36196a.m64596a("android.permission.READ_CONTACTS", dVar.f92466a)) {
            cxVar = C60866ct.f164955a;
        } else {
            Uri withAppendedPath = Uri.withAppendedPath(ContactsContract.CommonDataKinds.Phone.CONTENT_FILTER_URI, Uri.encode(formatNumber));
            if (withAppendedPath == null) {
                cxVar = C60866ct.f164955a;
            } else {
                C47558bi a = C46356a.m82648a(str2);
                try {
                    C60838bs g = dVar.f92467b.mo50872b(withAppendedPath, new String[]{"display_name"}, (String) null, (String[]) null, (String) null).f121591a.mo57272e(C47810es.m84970j(C34869c.f92465a), dVar.f92468c).mo57275g();
                    a.close();
                    cxVar = g;
                } catch (Throwable th) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
                    } catch (Exception unused) {
                    }
                }
            }
        }
        C34863k kVar = new C34863k(formatNumber);
        return C60922j.m93044g(cxVar, C47810es.m84963c(kVar), this.f92463b);
        throw th;
    }
}
