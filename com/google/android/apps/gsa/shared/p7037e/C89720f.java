package com.google.android.apps.gsa.shared.p7037e;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.libraries.p1646ay.C19601c;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.net.p4726a.p4727a.C62722b;
import dagger.C68214a;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p5535j.p5536a.p5556d.p5557a.C71168a;
import p5535j.p5536a.p5556d.p5557a.C71170c;
import p5535j.p5536a.p5556d.p5557a.C71171d;

/* renamed from: com.google.android.apps.gsa.shared.e.f */
/* compiled from: PG */
public final class C89720f {

    /* renamed from: a */
    public static final C59071e f242876a = C59071e.m91332i("com.google.android.apps.gsa.shared.e.f");

    /* renamed from: b */
    static final AtomicInteger f242877b = new AtomicInteger(0);

    /* renamed from: c */
    public static final long f242878c = TimeUnit.SECONDS.toMillis(30);

    /* renamed from: d */
    public final C68214a f242879d;

    /* renamed from: e */
    private final C90931ca f242880e;

    /* renamed from: f */
    private final PackageManager f242881f;

    /* renamed from: g */
    private final C68214a f242882g;

    /* renamed from: h */
    private final Context f242883h;

    public C89720f(Context context, C90931ca caVar, PackageManager packageManager, C68214a aVar, C68214a aVar2) {
        this.f242883h = context;
        this.f242880e = caVar;
        this.f242881f = packageManager;
        this.f242879d = aVar;
        this.f242882g = aVar2;
    }

    /* renamed from: b */
    public static void m146112b(C37215b bVar, C62722b bVar2, C71170c cVar, Integer num) {
        ((C59052c) ((C59052c) f242876a.mo56224b()).mo56372aa(10195)).mo56359L("logging finished with status %s, cause %s, and ved %d", bVar2, cVar, num);
        C37252a c = C37182a.f97963dj.mo40805c(bVar2);
        ((C37253b) c).mo40792p(C71171d.f189879e, m146115e(cVar, num));
        bVar.mo19974a(c);
    }

    /* renamed from: c */
    public static final String m146113c(String str) {
        return "gsa/".concat(String.valueOf(str));
    }

    /* renamed from: d */
    private static Integer m146114d(Intent intent) {
        try {
            return (Integer) C58833ax.m90833j(intent.getStringExtra("ved")).mo56106b(C89716b.f242868a).mo56106b(C89717c.f242869a).mo56111f();
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static C71171d m146115e(C71170c cVar, Integer num) {
        C71168a aVar = (C71168a) C71171d.f189878d.createBuilder();
        if (cVar != null) {
            aVar.copyOnWrite();
            C71171d dVar = (C71171d) aVar.instance;
            dVar.f189882b = cVar.f189877i;
            dVar.f189881a |= 1;
        }
        if (num != null) {
            int intValue = num.intValue();
            aVar.copyOnWrite();
            C71171d dVar2 = (C71171d) aVar.instance;
            dVar2.f189881a |= 2;
            dVar2.f189883c = intValue;
        }
        return (C71171d) aVar.build();
    }

    /* renamed from: f */
    private final void m146116f(C71170c cVar, Integer num) {
        m146112b((C37215b) this.f242882g.mo27525b(), C62722b.FAILED_PRECONDITION, cVar, num);
    }

    /* renamed from: a */
    public final C60870cx mo83611a(String str, Bitmap bitmap, Intent intent) {
        String str2 = str;
        Intent intent2 = intent;
        Integer d = m146114d(intent);
        ((C37215b) this.f242882g.mo27525b()).mo19974a(C37182a.f97962di.mo40812e(C71171d.f189879e, m146115e((C71170c) null, d)));
        if (!C19601c.m37399f(intent)) {
            m146116f(C71170c.UNSERIALIZABLE_INTENT, d);
            throw new RuntimeException("Intent passed to installAppShortcut is not serializable");
        } else if (intent2.resolveActivityInfo(this.f242881f, 0) != null) {
            C59071e eVar = f242876a;
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(10191)).mo56389s("Installing shortcut: %s", str2);
            Integer d2 = m146114d(intent);
            if (!((C58833ax) this.f242879d.mo27525b()).mo56113h()) {
                m146116f(C71170c.SHORTCUT_MANAGER_ABSENT, d2);
                return C60856cj.m92900i(false);
            }
            ShortcutManager shortcutManager = (ShortcutManager) ((C58833ax) this.f242879d.mo27525b()).mo56107c();
            if (!shortcutManager.isRequestPinShortcutSupported()) {
                ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(10193)).mo56386p("Shortcut installing unsupported");
                m146116f(C71170c.REQUEST_PIN_SHORTCUT_UNSUPPORTED, d2);
                return C60856cj.m92900i(false);
            }
            SettableFuture settableFuture = new SettableFuture();
            int incrementAndGet = f242877b.incrementAndGet();
            C89719e eVar2 = new C89719e(settableFuture, this.f242883h, (C37215b) this.f242882g.mo27525b(), incrementAndGet, d2);
            Intent intent3 = new Intent("com.google.android.apps.gsa.shared.api.BROADCAST_SHORTCUT_INSTALLED");
            intent3.putExtra("com.google.android.apps.gsa.shared.api.RESULT_CODE_EXTRA", incrementAndGet);
            this.f242883h.registerReceiver(eVar2, new IntentFilter("com.google.android.apps.gsa.shared.api.BROADCAST_SHORTCUT_INSTALLED"));
            PendingIntent broadcast = PendingIntent.getBroadcast(this.f242883h, incrementAndGet, intent3, 335544320);
            String stringExtra = intent2.getStringExtra("homescreen_shortcut_id");
            if (stringExtra == null) {
                stringExtra = str2;
            }
            String c = m146113c(stringExtra);
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(10192)).mo56386p("Requesting shortcut install");
            try {
                shortcutManager.requestPinShortcut(new ShortcutInfo.Builder(this.f242883h, c).setIntent(intent2).setIcon(Icon.createWithBitmap(bitmap)).setShortLabel(str2).build(), broadcast.getIntentSender());
                this.f242880e.mo85137b(new C89718d(eVar2), f242878c);
                return settableFuture;
            } catch (IllegalArgumentException e) {
                m146112b((C37215b) this.f242882g.mo27525b(), C62722b.INTERNAL, C71170c.ILLEGAL_ARGUMENT, d2);
                throw e;
            } catch (IllegalStateException e2) {
                m146112b((C37215b) this.f242882g.mo27525b(), C62722b.INTERNAL, C71170c.ILLEGAL_STATE, d2);
                throw e2;
            } catch (RuntimeException e3) {
                m146112b((C37215b) this.f242882g.mo27525b(), C62722b.INTERNAL, (C71170c) null, d2);
                throw e3;
            }
        } else {
            m146116f(C71170c.UNKNOWN_ACTIVITY, d);
            throw new IllegalArgumentException("Intent passed to installAppShortcut does not resolve to an Activity.");
        }
    }
}
