package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.C1932e;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: androidx.core.app.ai */
/* compiled from: PG */
public final class C1792ai implements C1830q {

    /* renamed from: a */
    public final Context f5597a;

    /* renamed from: b */
    public final Notification.Builder f5598b;

    /* renamed from: c */
    public final C1839z f5599c;

    /* renamed from: d */
    private final Bundle f5600d = new Bundle();

    public C1792ai(C1839z zVar) {
        String str;
        Bundle[] bundleArr;
        C1839z zVar2 = zVar;
        new ArrayList();
        this.f5599c = zVar2;
        this.f5597a = zVar2.f5681a;
        Notification.Builder builder = new Notification.Builder(zVar2.f5681a, zVar2.f5675F);
        this.f5598b = builder;
        Notification notification = zVar2.f5679J;
        Bundle[] bundleArr2 = null;
        int i = 0;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, (RemoteViews) null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(zVar2.f5685e).setContentText(zVar2.f5686f).setContentInfo(zVar2.f5689i).setContentIntent(zVar2.f5687g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent((PendingIntent) null, (notification.flags & 128) != 0).setLargeIcon(zVar2.f5688h).setNumber(0).setProgress(zVar2.f5696p, zVar2.f5697q, zVar2.f5698r);
        builder.setSubText(zVar2.f5694n).setUsesChronometer(zVar2.f5692l).setPriority(zVar2.f5690j);
        ArrayList arrayList = zVar2.f5682b;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            str = "android.support.allowGeneratedReplies";
            if (i2 >= size) {
                break;
            }
            C1832s sVar = (C1832s) arrayList.get(i2);
            IconCompat a = sVar.mo5010a();
            Notification.Action.Builder builder2 = new Notification.Action.Builder(a != null ? C1932e.m5233b(a, (Context) null) : null, sVar.f5661h, sVar.f5662i);
            C1811ba[] baVarArr = sVar.f5655b;
            if (baVarArr != null) {
                for (RemoteInput addRemoteInput : C1811ba.m4980a(baVarArr)) {
                    builder2.addRemoteInput(addRemoteInput);
                }
            }
            Bundle bundle = new Bundle(sVar.f5654a);
            bundle.putBoolean(str, sVar.f5656c);
            builder2.setAllowGeneratedReplies(sVar.f5656c);
            bundle.putInt("android.support.action.semanticAction", sVar.f5658e);
            builder2.setSemanticAction(sVar.f5658e);
            builder2.setContextual(sVar.f5659f);
            if (Build.VERSION.SDK_INT >= 31) {
                builder2.setAuthenticationRequired(sVar.f5663j);
            }
            bundle.putBoolean("android.support.action.showsUserInterface", sVar.f5657d);
            builder2.addExtras(bundle);
            this.f5598b.addAction(builder2.build());
            i2++;
        }
        Bundle bundle2 = zVar2.f5706z;
        if (bundle2 != null) {
            this.f5600d.putAll(bundle2);
        }
        this.f5598b.setShowWhen(zVar2.f5691k);
        this.f5598b.setLocalOnly(zVar2.f5702v).setGroup(zVar2.f5699s).setGroupSummary(zVar2.f5700t).setSortKey(zVar2.f5701u);
        this.f5598b.setCategory(zVar2.f5705y).setColor(zVar2.f5670A).setVisibility(zVar2.f5671B).setPublicVersion(zVar2.f5672C).setSound(notification.sound, notification.audioAttributes);
        ArrayList<String> arrayList2 = zVar2.f5680K;
        if (!arrayList2.isEmpty()) {
            for (String addPerson : arrayList2) {
                this.f5598b.addPerson(addPerson);
            }
        }
        if (zVar2.f5684d.size() > 0) {
            Bundle bundle3 = zVar.mo5014b().getBundle("android.car.EXTENSIONS");
            bundle3 = bundle3 == null ? new Bundle() : bundle3;
            Bundle bundle4 = new Bundle(bundle3);
            Bundle bundle5 = new Bundle();
            int i3 = 0;
            while (i3 < zVar2.f5684d.size()) {
                String num = Integer.toString(i3);
                C1832s sVar2 = (C1832s) zVar2.f5684d.get(i3);
                Bundle bundle6 = new Bundle();
                IconCompat a2 = sVar2.mo5010a();
                bundle6.putInt("icon", a2 != null ? a2.mo5073a() : 0);
                bundle6.putCharSequence("title", sVar2.f5661h);
                bundle6.putParcelable("actionIntent", sVar2.f5662i);
                Bundle bundle7 = new Bundle(sVar2.f5654a);
                bundle7.putBoolean(str, sVar2.f5656c);
                bundle6.putBundle("extras", bundle7);
                C1811ba[] baVarArr2 = sVar2.f5655b;
                if (baVarArr2 == null) {
                    bundleArr = bundleArr2;
                } else {
                    bundleArr = new Bundle[baVarArr2.length];
                    while (i < baVarArr2.length) {
                        C1811ba baVar = baVarArr2[i];
                        String str2 = str;
                        Bundle bundle8 = new Bundle();
                        C1811ba[] baVarArr3 = baVarArr2;
                        bundle8.putString("resultKey", baVar.f5636a);
                        bundle8.putCharSequence("label", baVar.f5637b);
                        bundle8.putCharSequenceArray("choices", baVar.f5638c);
                        bundle8.putBoolean("allowFreeFormInput", baVar.f5639d);
                        bundle8.putBundle("extras", baVar.f5641f);
                        Set<String> set = baVar.f5642g;
                        if (set != null && !set.isEmpty()) {
                            ArrayList arrayList3 = new ArrayList(set.size());
                            for (String add : set) {
                                arrayList3.add(add);
                            }
                            bundle8.putStringArrayList("allowedDataTypes", arrayList3);
                        }
                        bundleArr[i] = bundle8;
                        i++;
                        C1839z zVar3 = zVar;
                        str = str2;
                        baVarArr2 = baVarArr3;
                    }
                }
                String str3 = str;
                bundle6.putParcelableArray("remoteInputs", bundleArr);
                bundle6.putBoolean("showsUserInterface", sVar2.f5657d);
                bundle6.putInt("semanticAction", sVar2.f5658e);
                bundle5.putBundle(num, bundle6);
                i3++;
                zVar2 = zVar;
                str = str3;
                bundleArr2 = null;
                i = 0;
            }
            bundle3.putBundle("invisible_actions", bundle5);
            bundle4.putBundle("invisible_actions", bundle5);
            zVar.mo5014b().putBundle("android.car.EXTENSIONS", bundle3);
            this.f5600d.putBundle("android.car.EXTENSIONS", bundle4);
        }
        C1839z zVar4 = zVar;
        this.f5598b.setExtras(zVar4.f5706z).setRemoteInputHistory(zVar4.f5695o);
        RemoteViews remoteViews = zVar4.f5673D;
        if (remoteViews != null) {
            this.f5598b.setCustomContentView(remoteViews);
        }
        RemoteViews remoteViews2 = zVar4.f5674E;
        if (remoteViews2 != null) {
            this.f5598b.setCustomBigContentView(remoteViews2);
        }
        this.f5598b.setBadgeIconType(zVar4.f5676G).setSettingsText((CharSequence) null).setShortcutId((String) null).setTimeoutAfter(zVar4.f5677H).setGroupAlertBehavior(zVar4.f5678I);
        if (zVar4.f5704x) {
            this.f5598b.setColorized(zVar4.f5703w);
        }
        if (!TextUtils.isEmpty(zVar4.f5675F)) {
            this.f5598b.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
        }
        ArrayList arrayList4 = zVar4.f5683c;
        int size2 = arrayList4.size();
        for (int i4 = 0; i4 < size2; i4++) {
            this.f5598b.addPerson(C1801ar.m4955a((C1803at) arrayList4.get(i4)));
        }
        this.f5598b.setAllowSystemGeneratedContextualActions(true);
        this.f5598b.setBubbleMetadata((Notification.BubbleMetadata) null);
    }
}
