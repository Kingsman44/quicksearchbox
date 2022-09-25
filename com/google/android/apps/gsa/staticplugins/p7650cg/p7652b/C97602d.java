package com.google.android.apps.gsa.staticplugins.p7650cg.p7652b;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7000au.p7002b.C89291a;
import com.google.android.apps.gsa.shared.p7066m.C90081ef;
import com.google.android.apps.gsa.shared.search.p7138b.C90489e;
import com.google.android.apps.gsa.shared.search.p7138b.C90491g;
import com.google.android.apps.gsa.shared.util.C90734ar;
import com.google.android.apps.gsa.sidekick.main.notifications.C91532f;
import com.google.android.apps.gsa.sidekick.main.p7228t.C91622a;
import com.google.android.apps.gsa.sidekick.shared.p7241j.C91752h;
import com.google.android.apps.gsa.sidekick.shared.util.C91963an;
import com.google.android.apps.gsa.sidekick.shared.util.C91978bb;
import com.google.android.apps.gsa.sidekick.shared.util.C91986e;
import com.google.android.apps.gsa.sidekick.shared.util.C91987f;
import com.google.android.apps.gsa.sidekick.shared.util.C91992k;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.p375ai.p378b.C7526an;
import com.google.p375ai.p378b.C7536ax;
import com.google.p375ai.p378b.C7539b;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7838lv;
import com.google.p375ai.p378b.C7864mu;
import com.google.p375ai.p378b.C7874nd;
import java.util.Collections;

/* renamed from: com.google.android.apps.gsa.staticplugins.cg.b.d */
/* compiled from: PG */
public final class C97602d implements C91532f {

    /* renamed from: a */
    private final C7526an f272632a;

    /* renamed from: b */
    private final C7864mu f272633b;

    /* renamed from: c */
    private final C7718hj f272634c;

    /* renamed from: d */
    private final C89291a f272635d;

    /* renamed from: e */
    private final C86124t f272636e;

    public C97602d(C7526an anVar, C7718hj hjVar, C89291a aVar, C86124t tVar) {
        this.f272632a = anVar;
        this.f272634c = hjVar;
        this.f272633b = null;
        this.f272635d = aVar;
        this.f272636e = tVar;
    }

    public C97602d(C7864mu muVar, C7718hj hjVar, C89291a aVar, C86124t tVar) {
        this.f272633b = muVar;
        this.f272634c = hjVar;
        this.f272632a = null;
        this.f272635d = aVar;
        this.f272636e = tVar;
    }

    /* renamed from: a */
    public final int mo85902a() {
        int a;
        C7526an anVar = this.f272632a;
        if (anVar != null) {
            return C91987f.m150963a(anVar);
        }
        C7864mu muVar = this.f272633b;
        if (muVar != null) {
            C7536ax axVar = muVar.f27547c;
            if (axVar == null) {
                axVar = C7536ax.f26084o;
            }
            if ((axVar.f26086a & 16) != 0) {
                C7536ax axVar2 = this.f272633b.f27547c;
                if (axVar2 == null) {
                    axVar2 = C7536ax.f26084o;
                }
                C7838lv lvVar = axVar2.f26094i;
                if (lvVar == null) {
                    lvVar = C7838lv.f27474p;
                }
                int i = 1;
                if (lvVar.f27477b == 1 && (a = C7539b.m22781a(((Integer) lvVar.f27478c).intValue())) != 0) {
                    i = a;
                }
                return C91992k.m150980h(i);
            }
        }
        throw new C91963an();
    }

    /* renamed from: b */
    public final PendingIntent mo85903b(Context context, int i, int i2) {
        Intent intent;
        C7536ax axVar;
        C90491g gVar;
        if (this.f272632a != null) {
            C7681g gVar2 = C7681g.MANAGE_NOTIFICATIONS;
            int i3 = this.f272632a.f26060j;
            C7681g a = C7681g.m22802a(i3);
            if (a == null) {
                a = C7681g.INVALID;
            }
            if (gVar2 == a) {
                intent = C91986e.m150962a(context);
            } else {
                C7681g gVar3 = C7681g.NOTIFICATION_FEEDBACK_CLICKED;
                C7681g a2 = C7681g.m22802a(i3);
                if (a2 == null) {
                    a2 = C7681g.INVALID;
                }
                if (gVar3 != a2) {
                    C7681g gVar4 = C7681g.NOTIFICATION_FEEDBACK_THUMBS_DOWN;
                    C7681g a3 = C7681g.m22802a(i3);
                    if (a3 == null) {
                        a3 = C7681g.INVALID;
                    }
                    if (gVar4 != a3) {
                        C7681g gVar5 = C7681g.NOTIFICATION_FEEDBACK_THUMBS_UP;
                        C7681g a4 = C7681g.m22802a(i3);
                        if (a4 == null) {
                            a4 = C7681g.INVALID;
                        }
                        if (gVar5 != a4) {
                            C7681g gVar6 = C7681g.DISAMBIGUATION_QUESTION_CLICKED;
                            C7681g a5 = C7681g.m22802a(i3);
                            if (a5 == null) {
                                a5 = C7681g.INVALID;
                            }
                            if (gVar6 != a5) {
                                C7681g gVar7 = C7681g.DISAMBIGUATION_QUESTION_HERE;
                                C7681g a6 = C7681g.m22802a(i3);
                                if (a6 == null) {
                                    a6 = C7681g.INVALID;
                                }
                                if (gVar7 != a6) {
                                    C7681g gVar8 = C7681g.DISAMBIGUATION_QUESTION_NOT_HERE;
                                    C7681g a7 = C7681g.m22802a(i3);
                                    if (a7 == null) {
                                        a7 = C7681g.INVALID;
                                    }
                                    if (gVar8 != a7) {
                                        PackageManager packageManager = context.getPackageManager();
                                        C7526an anVar = this.f272632a;
                                        int i4 = anVar.f26051a;
                                        if ((i4 & 2) != 0) {
                                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(anVar.f26053c));
                                            if ((anVar.f26051a & 128) != 0) {
                                                intent2.setPackage(anVar.f26058h);
                                                if (intent2.resolveActivity(packageManager) != null) {
                                                    intent2.setPackage((String) null);
                                                }
                                            }
                                            intent = intent2;
                                        } else if ((i4 & 4) != 0) {
                                            intent = new Intent(anVar.f26054d);
                                        } else if ((i4 & 8) != 0) {
                                            String str = anVar.f26055e;
                                            int i5 = i4 & 256;
                                            if (i5 == 0 && (i4 & 2048) == 0) {
                                                gVar = null;
                                            } else {
                                                String str2 = i5 != 0 ? anVar.f26059i : null;
                                                String str3 = (i4 & 2048) != 0 ? anVar.f26061k : null;
                                                C90489e eVar = (C90489e) C90491g.f252884z.createBuilder();
                                                if (str2 != null) {
                                                    eVar.copyOnWrite();
                                                    C90491g gVar9 = (C90491g) eVar.instance;
                                                    gVar9.f252886a |= 2;
                                                    gVar9.f252888c = str2;
                                                }
                                                if (str3 != null) {
                                                    eVar.copyOnWrite();
                                                    C90491g gVar10 = (C90491g) eVar.instance;
                                                    gVar10.f252886a |= 4;
                                                    gVar10.f252889d = str3;
                                                }
                                                gVar = (C90491g) eVar.build();
                                            }
                                            intent = C91752h.m150310a((Context) null, str, gVar, false);
                                        } else {
                                            intent = null;
                                        }
                                        if (intent != null) {
                                            intent.setFlags(268435456);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                Intent intent3 = new Intent();
                C7681g a8 = C7681g.m22802a(this.f272632a.f26060j);
                if (a8 == null) {
                    a8 = C7681g.INVALID;
                }
                Intent putExtra = intent3.setAction(Integer.toString(a8.f26835cv)).setFlags(276824064).putExtra("com.google.android.apps.gsa.staticplugins.nowwidget.notifications.NOTIFICATION_ENTRY", this.f272634c.toByteArray());
                C7681g a9 = C7681g.m22802a(this.f272632a.f26060j);
                if (a9 == null) {
                    a9 = C7681g.INVALID;
                }
                intent = C91622a.f255550a.mo83277a(putExtra.putExtra("com.google.android.apps.gsa.staticplugins.nowwidget.notifications.NOTIFICATION_ACTION", a9.f26835cv));
            }
        } else {
            C7864mu muVar = this.f272633b;
            if (muVar != null) {
                C89291a aVar = this.f272635d;
                if ((muVar.f27545a & 2) != 0) {
                    axVar = muVar.f27547c;
                    if (axVar == null) {
                        axVar = C7536ax.f26084o;
                    }
                } else {
                    axVar = null;
                }
                C9141ad g = C91992k.m150979g(context, aVar, true, axVar);
                if (g == null) {
                    return null;
                }
                Intent action = new Intent().setComponent(new ComponentName(context, "com.google.android.apps.gsa.broadcastreceiver.CommonBroadcastReceiver")).setAction("com.google.android.apps.sidekick.NOTIFICATION_ACTION_CLIENT_ACTION");
                C90734ar.m148200c(action, "clientActionKey", g);
                C91978bb.m150940f(action, "notification_entries", Collections.singletonList(this.f272634c));
                action.putExtra("notificationIdKey", i);
                action.setData(Uri.parse("notification_action://" + i + "_" + i2));
                action.putExtra("action_dismisses_notification", mo85908g());
                if (this.f272636e.mo79746e(C90081ef.f249844m)) {
                    C7536ax axVar2 = this.f272633b.f27547c;
                    if (axVar2 == null) {
                        axVar2 = C7536ax.f26084o;
                    }
                    C7681g a10 = C7681g.m22802a(axVar2.f26090e);
                    if (a10 == null) {
                        a10 = C7681g.DETAILS;
                    }
                    if (a10 == C7681g.SHARE_NOTIFICATION) {
                        action.putExtra("notification_is_sticky", !this.f272633b.f27548d);
                        C7874nd ndVar = this.f272634c.f26938J;
                        if (ndVar == null) {
                            ndVar = C7874nd.f27577J;
                        }
                        action.putExtra("notification_expiration_seconds", ndVar.f27594f);
                        return PendingIntent.getBroadcast(context, i, action, 201326592);
                    }
                }
                if (mo85908g()) {
                    return PendingIntent.getBroadcast(context, i, action, 1140850688);
                }
                return PendingIntent.getBroadcast(context, i, action, 201326592);
            }
            intent = null;
        }
        if (intent == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i, intent, 201326592);
    }

    /* renamed from: c */
    public final Bundle mo85904c() {
        return Bundle.EMPTY;
    }

    /* renamed from: d */
    public final C7681g mo85905d() {
        C7526an anVar = this.f272632a;
        if (anVar != null) {
            C7681g a = C7681g.m22802a(anVar.f26060j);
            return a == null ? C7681g.INVALID : a;
        }
        C7864mu muVar = this.f272633b;
        if (muVar == null || (muVar.f27545a & 2) == 0) {
            return C7681g.INVALID;
        }
        C7536ax axVar = muVar.f27547c;
        if (axVar == null) {
            axVar = C7536ax.f26084o;
        }
        C7681g a2 = C7681g.m22802a(axVar.f26090e);
        return a2 == null ? C7681g.DETAILS : a2;
    }

    /* renamed from: e */
    public final String mo85906e(Context context) {
        C7526an anVar = this.f272632a;
        if (anVar != null) {
            return anVar.f26052b;
        }
        C7864mu muVar = this.f272633b;
        return muVar != null ? muVar.f27546b : BuildConfig.FLAVOR;
    }

    /* renamed from: f */
    public final boolean mo85907f() {
        return true;
    }

    /* renamed from: g */
    public final boolean mo85908g() {
        C7864mu muVar = this.f272633b;
        if (muVar == null) {
            return true;
        }
        return muVar.f27548d;
    }
}
