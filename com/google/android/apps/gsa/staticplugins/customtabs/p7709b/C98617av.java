package com.google.android.apps.gsa.staticplugins.customtabs.p7709b;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6807j.C86139h;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.android.apps.gsa.shared.p7195y.C91227s;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54098av;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54120s;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54124w;
import com.google.protobuf.MessageLite;
import dagger.C68214a;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.b.av */
/* compiled from: PG */
final class C98617av {

    /* renamed from: a */
    public static final C59071e f275449a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.customtabs.b.av");

    /* renamed from: b */
    public final C86124t f275450b;

    /* renamed from: c */
    private final Context f275451c;

    /* renamed from: d */
    private final C68214a f275452d;

    /* renamed from: e */
    private final C69464a f275453e;

    /* renamed from: f */
    private final C91227s f275454f;

    public C98617av(Context context, C86124t tVar, C68214a aVar, C69464a aVar2, C91227s sVar) {
        this.f275451c = context;
        this.f275450b = tVar;
        this.f275452d = aVar;
        this.f275453e = aVar2;
        this.f275454f = sVar;
    }

    /* renamed from: a */
    public static C28292j m163365a() {
        C28292j jVar = new C28292j(40997);
        jVar.mo33795i(5);
        jVar.mo33794h(1);
        return jVar;
    }

    /* renamed from: d */
    public static void m163366d(RemoteViews remoteViews, int i, C60870cx cxVar) {
        try {
            C58833ax axVar = (C58833ax) C60856cj.m92909r(cxVar);
            if (axVar.mo56113h()) {
                Bitmap b = C90772bp.m148294b((Drawable) axVar.mo56107c());
                if (b != null) {
                    remoteViews.setImageViewBitmap(i, b);
                    remoteViews.setViewVisibility(i, 0);
                    return;
                }
                C59104x c = f275449a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "BottomBarFactory");
                ((C59052c) ((C59052c) c).mo56372aa(19182)).mo56386p("Drawable bitmap is null");
            }
        } catch (Exception unused) {
            C59104x c2 = f275449a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "BottomBarFactory");
            ((C59052c) ((C59052c) c2).mo56372aa(19183)).mo56386p("Image loading failed");
        }
    }

    /* renamed from: e */
    public static boolean m163367e(long j) {
        return j == 10 || j == 15 || j == 16 || m163368f(j);
    }

    /* renamed from: f */
    public static boolean m163368f(long j) {
        return j == 14 || j == 17;
    }

    /* renamed from: g */
    public static boolean m163369g(long j) {
        return j == 9 || m163367e(j);
    }

    /* renamed from: b */
    public final C58833ax mo91226b(C54120s sVar, C98642y yVar) {
        int i;
        long a = this.f275450b.mo79743a(C90110fh.f250579D);
        if (a == 4) {
            return C58836b.f156633a;
        }
        boolean booleanValue = ((Boolean) this.f275453e.mo17428b()).booleanValue();
        if (a == 6) {
            i = booleanValue ? R.layout.explore_bottombar_dark : R.layout.explore_bottombar_light;
        } else if (a == 9) {
            i = booleanValue ? R.layout.explore_bottombar_dark_x_button : R.layout.explore_bottombar_light_x_button;
        } else if (a == 10) {
            i = booleanValue ? R.layout.explore_bottombar_dark_content_forward : R.layout.explore_bottombar_light_content_forward;
        } else if (a == 14) {
            i = booleanValue ? R.layout.explore_bottombar_dark_card_peek : R.layout.explore_bottombar_light_card_peek;
        } else if (a == 15) {
            i = booleanValue ? R.layout.explore_bottombar_dark_content_forward_animated_horizontal : R.layout.explore_bottombar_light_content_forward_animated_horizontal;
        } else if (a == 16) {
            i = booleanValue ? R.layout.explore_bottombar_dark_content_forward_animated_vertical : R.layout.explore_bottombar_light_content_forward_animated_vertical;
        } else if (a == 17) {
            i = booleanValue ? R.layout.explore_bottombar_dark_card_peek_2 : R.layout.explore_bottombar_light_card_peek_2;
        } else {
            ((C89911f) this.f275452d.mo27525b()).mo83756b(new C90452a(211, C89885b.EXPLORE_ON_CONTENT_INVALID_BOTTOM_BAR_TYPE_VALUE)).mo83721a();
            throw new IllegalStateException("Invalid bottom bar type");
        }
        C54098av avVar = sVar.f142012c;
        if (avVar == null) {
            avVar = C54098av.f141935j;
        }
        if ((avVar.f141937a & 8) != 0) {
            C54098av avVar2 = sVar.f142012c;
            if (avVar2 == null) {
                avVar2 = C54098av.f141935j;
            }
            C54124w wVar = avVar2.f141941e;
            if (wVar == null) {
                wVar = C54124w.f142030c;
            }
            if (!wVar.f142033b.isEmpty()) {
                RemoteViews remoteViews = new RemoteViews(this.f275451c.getPackageName(), i);
                remoteViews.setInt(R.id.customtabs_bottom_bar, "setMinimumHeight", (int) (((float) ((int) this.f275450b.mo79743a(C90110fh.f250650av))) * this.f275451c.getResources().getDisplayMetrics().density));
                C54098av avVar3 = sVar.f142012c;
                if (avVar3 == null) {
                    avVar3 = C54098av.f141935j;
                }
                C54124w wVar2 = avVar3.f141941e;
                if (wVar2 == null) {
                    wVar2 = C54124w.f142030c;
                }
                remoteViews.setTextViewText(R.id.explore_bottombar_title, wVar2.f142033b);
                if (m163369g(a)) {
                    Intent intent = new Intent("com.google.android.apps.gsa.broadcastreceiver.ACTION_CUSTOMTABS_DISMISS_BOTTOM_BAR");
                    intent.setClassName(this.f275451c, "com.google.android.apps.gsa.broadcastreceiver.CommonBroadcastReceiver");
                    intent.addFlags(268435456);
                    C86139h hVar = yVar.f275515t;
                    if (hVar != null) {
                        intent.putExtra("EXTRA_RESTORATION_DATA", new ProtoLiteParcelable((MessageLite) hVar));
                        remoteViews.setOnClickPendingIntent(R.id.explore_bottombar_close, PendingIntent.getBroadcast(this.f275451c, yVar.f275505j, intent, 201326592));
                        if (this.f275450b.mo79746e(C90110fh.f250654az)) {
                            remoteViews.setImageViewResource(R.id.explore_bottombar_close, R.drawable.quantum_ic_expand_more_grey600_24);
                        }
                    } else {
                        throw new IllegalStateException("Session has not been prepared yet");
                    }
                }
                return C58833ax.m90834k(remoteViews);
            }
        }
        ((C89911f) this.f275452d.mo27525b()).mo83756b(new C90452a(211, C89885b.EXPLORE_ON_CONTENT_RESPONSE_WITHOUT_PEEK_TEXT_VALUE)).mo83721a();
        return C58836b.f156633a;
    }

    /* renamed from: c */
    public final C60870cx mo91227c(String str) {
        if (!TextUtils.isEmpty(str)) {
            return C60922j.m93044g(this.f275454f.mo85510a(str, 7), C98614as.f275437a, C60826bg.f164896a);
        }
        C58976aa aaVar = C58975e.f156826a;
        return C60856cj.m92900i(C58836b.f156633a);
    }
}
