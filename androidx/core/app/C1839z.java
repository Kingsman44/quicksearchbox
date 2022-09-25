package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

/* renamed from: androidx.core.app.z */
/* compiled from: PG */
public final class C1839z {

    /* renamed from: A */
    public int f5670A = 0;

    /* renamed from: B */
    public int f5671B = 0;

    /* renamed from: C */
    public Notification f5672C;

    /* renamed from: D */
    public RemoteViews f5673D;

    /* renamed from: E */
    public RemoteViews f5674E;

    /* renamed from: F */
    public String f5675F;

    /* renamed from: G */
    public int f5676G = 0;

    /* renamed from: H */
    public long f5677H;

    /* renamed from: I */
    public int f5678I = 0;

    /* renamed from: J */
    public final Notification f5679J;
    @Deprecated

    /* renamed from: K */
    public final ArrayList f5680K;

    /* renamed from: a */
    public final Context f5681a;

    /* renamed from: b */
    public final ArrayList f5682b = new ArrayList();

    /* renamed from: c */
    public final ArrayList f5683c = new ArrayList();

    /* renamed from: d */
    public final ArrayList f5684d = new ArrayList();

    /* renamed from: e */
    public CharSequence f5685e;

    /* renamed from: f */
    public CharSequence f5686f;

    /* renamed from: g */
    public PendingIntent f5687g;

    /* renamed from: h */
    public Bitmap f5688h;

    /* renamed from: i */
    public CharSequence f5689i;

    /* renamed from: j */
    public int f5690j;

    /* renamed from: k */
    public boolean f5691k = true;

    /* renamed from: l */
    public boolean f5692l;

    /* renamed from: m */
    C1789af f5693m;

    /* renamed from: n */
    public CharSequence f5694n;

    /* renamed from: o */
    public CharSequence[] f5695o;

    /* renamed from: p */
    int f5696p;

    /* renamed from: q */
    int f5697q;

    /* renamed from: r */
    boolean f5698r;

    /* renamed from: s */
    public String f5699s;

    /* renamed from: t */
    public boolean f5700t;

    /* renamed from: u */
    public String f5701u;

    /* renamed from: v */
    public boolean f5702v = false;

    /* renamed from: w */
    public boolean f5703w;

    /* renamed from: x */
    public boolean f5704x;

    /* renamed from: y */
    public String f5705y;

    /* renamed from: z */
    public Bundle f5706z;

    public C1839z(Context context, String str) {
        Notification notification = new Notification();
        this.f5679J = notification;
        this.f5681a = context;
        this.f5675F = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f5690j = 0;
        this.f5680K = new ArrayList();
    }

    /* renamed from: c */
    public static CharSequence m5037c(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    /* renamed from: a */
    public final Notification mo5013a() {
        Bundle bundle;
        RemoteViews f;
        RemoteViews k;
        C1792ai aiVar = new C1792ai(this);
        C1789af afVar = aiVar.f5599c.f5693m;
        if (afVar != null) {
            afVar.mo4987b(aiVar);
        }
        RemoteViews l = afVar != null ? afVar.mo4990l() : null;
        Notification build = aiVar.f5598b.build();
        if (l != null) {
            build.contentView = l;
        } else {
            RemoteViews remoteViews = aiVar.f5599c.f5673D;
            if (remoteViews != null) {
                build.contentView = remoteViews;
            }
        }
        if (!(afVar == null || (k = afVar.mo4989k()) == null)) {
            build.bigContentView = k;
        }
        if (!(afVar == null || (f = aiVar.f5599c.f5693m.mo4988f()) == null)) {
            build.headsUpContentView = f;
        }
        if (!(afVar == null || (bundle = build.extras) == null)) {
            afVar.mo4995h(bundle);
        }
        return build;
    }

    /* renamed from: b */
    public final Bundle mo5014b() {
        if (this.f5706z == null) {
            this.f5706z = new Bundle();
        }
        return this.f5706z;
    }

    /* renamed from: d */
    public final void mo5015d(int i, boolean z) {
        if (z) {
            Notification notification = this.f5679J;
            notification.flags = i | notification.flags;
            return;
        }
        Notification notification2 = this.f5679J;
        notification2.flags = (i ^ -1) & notification2.flags;
    }

    /* renamed from: e */
    public final void mo5016e(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this.f5682b.add(new C1832s(i, charSequence, pendingIntent));
    }

    /* renamed from: f */
    public final void mo5017f(C1832s sVar) {
        if (sVar != null) {
            this.f5682b.add(sVar);
        }
    }

    /* renamed from: g */
    public final void mo5018g(Bundle bundle) {
        Bundle bundle2 = this.f5706z;
        if (bundle2 == null) {
            this.f5706z = new Bundle(bundle);
        } else {
            bundle2.putAll(bundle);
        }
    }

    /* renamed from: h */
    public final void mo5019h(int i) {
        this.f5679J.defaults = i;
        if ((i & 4) != 0) {
            this.f5679J.flags |= 1;
        }
    }

    /* renamed from: i */
    public final void mo5020i(int i, int i2, boolean z) {
        this.f5696p = i;
        this.f5697q = i2;
        this.f5698r = z;
    }

    /* renamed from: j */
    public final void mo5021j(Uri uri) {
        this.f5679J.sound = uri;
        this.f5679J.audioStreamType = -1;
        AudioAttributes.Builder d = C1838y.m5035d(C1838y.m5033b(C1838y.m5032a(), 4), 5);
        this.f5679J.audioAttributes = C1838y.m5036e(d);
    }

    /* renamed from: k */
    public final void mo5022k(C1789af afVar) {
        if (this.f5693m != afVar) {
            this.f5693m = afVar;
            if (afVar != null && afVar.f5579e != this) {
                afVar.f5579e = this;
                C1839z zVar = afVar.f5579e;
                if (zVar != null) {
                    zVar.mo5022k(afVar);
                }
            }
        }
    }

    /* renamed from: l */
    public final void mo5023l(CharSequence charSequence) {
        this.f5679J.tickerText = m5037c(charSequence);
    }
}
