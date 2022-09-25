package com.google.android.apps.gsa.staticplugins.opa.morris2.framework;

import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import androidx.core.app.C1831r;
import androidx.core.app.C1832s;
import androidx.core.app.C1839z;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1081b.C14728b;
import com.google.android.libraries.assistant.auto.tng.morris.p1069d.p1070a.C14173n;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14262cs;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14355gd;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14378h;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14486l;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14498ll;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14499lm;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14513m;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14567o;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi;
import com.google.android.libraries.assistant.auto.tng.morris.p1072f.C14637a;
import com.google.android.libraries.assistant.auto.tng.morris.p1072f.C14639b;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.C15362p;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.C15363q;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1091c.C15130a;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1091c.C15140b;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1091c.C15142d;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1091c.C15143e;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1091c.C15146h;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1091c.C15149k;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1091c.C15152n;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1091c.C15155q;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1091c.C15156r;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1091c.C15157s;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1091c.C15158t;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15328b;
import com.google.android.libraries.assistant.auto.tng.morris.service.C15457c;
import com.google.android.libraries.assistant.auto.tng.morris.service.C15458d;
import com.google.android.libraries.p11029ao.p11030a.C147798a;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.apps.tiktok.inject.p3657c.C47215a;
import com.google.assistant.p3897e.p3917i.p3918a.C51474ja;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.net.p4726a.p4727a.C62722b;
import p3186j$.time.Duration;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.framework.g */
/* compiled from: PG */
public final /* synthetic */ class C109630g implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Optional f305307a;

    public /* synthetic */ C109630g(Optional optional) {
        this.f305307a = optional;
    }

    public final void accept(Object obj) {
        boolean z;
        NotificationChannel notificationChannel;
        C15157s sVar;
        C15158t tVar;
        C15158t tVar2;
        int i;
        C15363q qVar;
        C14355gd gdVar;
        C14355gd gdVar2;
        int i2;
        C14355gd gdVar3;
        C14355gd gdVar4;
        int i3;
        C14603pi piVar;
        int i4;
        ViewGroup viewGroup;
        int a;
        int i5;
        int i6;
        C14499lm b = ((C14728b) this.f305307a.get()).mo21712b();
        C15458d dVar = ((C15457c) obj).f46358a;
        C14567o oVar = b.f43853d;
        if (oVar == null || ((a = C14513m.m30631a(oVar.f44043b)) != 0 && a == 5)) {
            dVar.f46368j.hide();
        } else {
            if (!dVar.f46368j.isShowing()) {
                dVar.f46368j.show();
            }
            C14567o oVar2 = b.f43853d;
            if (oVar2 == null) {
                oVar2 = C14567o.f44040d;
            }
            C14567o oVar3 = dVar.f46371m.f43853d;
            if (oVar3 == null) {
                oVar3 = C14567o.f44040d;
            }
            if (!oVar2.equals(oVar3)) {
                C15140b bVar = dVar.f46368j;
                C14567o oVar4 = b.f43853d;
                if (oVar4 == null) {
                    oVar4 = C14567o.f44040d;
                }
                C15143e eVar = bVar.f45430a;
                eVar.getClass();
                C58976aa aaVar = C58975e.f156826a;
                C15142d dVar2 = eVar.f45436a;
                if (dVar2 != null) {
                    C15146h a2 = dVar2.mo17754z();
                    C15130a aVar = a2.f45442d;
                    C14378h hVar = oVar4.f44042a;
                    if (hVar == null) {
                        hVar = C14378h.f43505c;
                    }
                    View view = aVar.f45413b;
                    view.getClass();
                    view.setVisibility(true != hVar.equals(C14378h.f43505c) ? 0 : 8);
                    C15149k kVar = a2.f45441c;
                    ContextThemeWrapper contextThemeWrapper = a2.f45445g;
                    contextThemeWrapper.getClass();
                    C59104x b2 = C15149k.f45449a.mo56224b();
                    b2.mo56378ag(C58975e.f156826a, "Morris.BubbleIconRndr");
                    ((C59052c) ((C59052c) b2).mo56372aa(45982)).mo56386p("#render");
                    int a3 = C14513m.m30631a(oVar4.f44043b);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    boolean z2 = !(a3 == kVar.f45453e);
                    if (z2) {
                        ViewGroup viewGroup2 = kVar.f45452d;
                        viewGroup2.getClass();
                        viewGroup2.removeAllViews();
                    }
                    int a4 = C14513m.m30631a(oVar4.f44043b);
                    if (a4 == 0) {
                        a4 = 1;
                    }
                    int i7 = a4 - 2;
                    if (i7 == 1) {
                        if (z2) {
                            kVar.f45450b.f45477a = null;
                        }
                        C15156r rVar = kVar.f45450b;
                        ViewGroup viewGroup3 = kVar.f45452d;
                        viewGroup3.getClass();
                        if (rVar.f45477a == null) {
                            rVar.f45477a = LayoutInflater.from(contextThemeWrapper).inflate(R.layout.default_bubble_layout, viewGroup3, true);
                        }
                    } else if (i7 == 2) {
                        if (z2) {
                            kVar.f45451c.f45476a = null;
                        }
                        C15155q qVar2 = kVar.f45451c;
                        ViewGroup viewGroup4 = kVar.f45452d;
                        viewGroup4.getClass();
                        if (qVar2.f45476a == null) {
                            qVar2.f45476a = LayoutInflater.from(contextThemeWrapper).inflate(R.layout.call_bubble_layout, viewGroup4, true);
                        }
                    }
                    int a5 = C14513m.m30631a(oVar4.f44043b);
                    if (a5 == 0) {
                        a5 = 1;
                    }
                    kVar.f45453e = a5;
                    if (a2.f45448j.equals(C14567o.f44040d)) {
                        C14486l lVar = oVar4.f44044c;
                        if (lVar == null) {
                            lVar = C14486l.f43777c;
                        }
                        if (!lVar.equals(C14486l.f43777c)) {
                            C15152n nVar = a2.f45444f;
                            C14486l lVar2 = oVar4.f44044c;
                            int i8 = (lVar2 == null ? C14486l.f43777c : lVar2).f43779a;
                            if (lVar2 == null) {
                                lVar2 = C14486l.f43777c;
                            }
                            nVar.mo22025d(i8, lVar2.f43780b);
                        } else {
                            int dimensionPixelSize = a2.f45439a.getResources().getDimensionPixelSize(R.dimen.bubble_icon_size) / 2;
                            int layoutDirection = a2.f45439a.getResources().getConfiguration().getLayoutDirection();
                            C47215a aVar2 = (C47215a) a2.f45440b.getHost();
                            aVar2.getClass();
                            Window r = aVar2.mo51123r();
                            if (Build.VERSION.SDK_INT >= 30) {
                                Rect bounds = r.getWindowManager().getMaximumWindowMetrics().getBounds();
                                i5 = bounds.width();
                                i6 = bounds.height();
                            } else {
                                DisplayMetrics displayMetrics = new DisplayMetrics();
                                r.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                                int i9 = displayMetrics.widthPixels;
                                int i10 = displayMetrics.heightPixels;
                                i5 = i9;
                                i6 = i10;
                            }
                            C15152n nVar2 = a2.f45444f;
                            if (layoutDirection != 1) {
                                dimensionPixelSize = i5 - dimensionPixelSize;
                            }
                            nVar2.mo22025d(dimensionPixelSize, (int) (((float) i6) * 0.33f));
                        }
                    }
                    a2.f45448j = oVar4;
                }
            }
        }
        if (b.f43850a == 7) {
            if (!dVar.f46369k.isShowing()) {
                dVar.f46369k.show();
            }
            C15157s sVar2 = dVar.f46369k;
            if (!b.equals(sVar2.f45480c)) {
                C15158t tVar3 = sVar2.f45479a;
                tVar3.getClass();
                C58976aa aaVar2 = C58975e.f156826a;
                if (b.equals(tVar3.f45487e)) {
                    sVar = sVar2;
                } else {
                    C15362p pVar = tVar3.f45488f;
                    if (pVar != null) {
                        C15363q a6 = pVar.mo17754z();
                        C14262cs csVar = b.f43852c;
                        if (csVar == null) {
                            csVar = C14262cs.f43141g;
                        }
                        C14262cs csVar2 = a6.f46127g.f43852c;
                        if (csVar2 == null) {
                            csVar2 = C14262cs.f43141g;
                        }
                        if (!csVar.equals(csVar2)) {
                            ViewGroup viewGroup5 = (ViewGroup) a6.f46123c.requireView().findViewById(R.id.energy_bar_container);
                            qVar = a6;
                            tVar2 = tVar3;
                            sVar = sVar2;
                            i = 7;
                            a6.f46125e.mo22236a(b, viewGroup5, a6.f46122b, false, a6.f46121a.mo79746e(C90051dc.f248768C) && C15328b.m31911b(b));
                            if (b.f43852c == null) {
                                viewGroup = viewGroup5;
                                i4 = 8;
                            } else {
                                viewGroup = viewGroup5;
                                i4 = 0;
                            }
                            viewGroup.setVisibility(i4);
                        } else {
                            qVar = a6;
                            tVar2 = tVar3;
                            sVar = sVar2;
                            i = 7;
                        }
                        if (b.f43850a == i) {
                            gdVar = (C14355gd) b.f43851b;
                        } else {
                            gdVar = C14355gd.f43438d;
                        }
                        C14499lm lmVar = qVar.f46127g;
                        if (lmVar.f43850a == i) {
                            gdVar2 = (C14355gd) lmVar.f43851b;
                        } else {
                            gdVar2 = C14355gd.f43438d;
                        }
                        if (!gdVar.equals(gdVar2)) {
                            if (b.f43850a == i) {
                                gdVar4 = (C14355gd) b.f43851b;
                            } else {
                                gdVar4 = C14355gd.f43438d;
                            }
                            C14603pi piVar2 = C14603pi.f44158c;
                            C14603pi piVar3 = gdVar4.f43442c;
                            if (piVar3 != null) {
                                ViewGroup viewGroup6 = (ViewGroup) qVar.f46123c.requireView().findViewById(R.id.incoming_task_container);
                                if (viewGroup6.getAnimation() != null) {
                                    viewGroup6.setAnimation((Animation) null);
                                    viewGroup6.removeAllViews();
                                }
                                piVar = piVar3;
                                i3 = 4;
                            } else {
                                C14603pi piVar4 = gdVar4.f43440a;
                                if (piVar4 != null) {
                                    piVar = piVar4;
                                    i3 = 3;
                                } else {
                                    C14603pi piVar5 = gdVar4.f43441b;
                                    if (piVar5 != null) {
                                        piVar = piVar5;
                                        i3 = 5;
                                    } else {
                                        piVar = piVar2;
                                        i3 = 2;
                                    }
                                }
                            }
                            qVar.f46124d.mo21974d(piVar, i3, (ViewGroup) qVar.f46123c.requireView().findViewById(R.id.incoming_task_container), (ViewGroup) qVar.f46123c.requireView().findViewById(R.id.expanded_ongoing_task_container), (ViewGroup) qVar.f46123c.requireView().findViewById(R.id.expanded_ongoing_task_container), (ViewGroup) qVar.f46123c.requireView().findViewById(R.id.immersive_task_container), (ViewGroup) null, 4, qVar.f46122b, false, 0, false, (gdVar4.f43440a == null || gdVar4.f43442c == null) ? false : true);
                        }
                        View findViewById = qVar.f46123c.requireView().findViewById(R.id.nav_bar_buffer);
                        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                        layoutParams.getClass();
                        if (qVar.f46126f.mo22275a() == -1) {
                            i2 = 0;
                        } else {
                            i2 = qVar.f46126f.mo22275a();
                        }
                        layoutParams.height = i2;
                        if (qVar.f46126f.mo22276b()) {
                            findViewById.setVisibility(8);
                        } else if (b.f43852c != null) {
                            findViewById.setVisibility(0);
                        } else {
                            if (b.f43850a == i) {
                                gdVar3 = (C14355gd) b.f43851b;
                            } else {
                                gdVar3 = C14355gd.f43438d;
                            }
                            if (gdVar3.f43442c != null) {
                                findViewById.setVisibility(4);
                            } else {
                                findViewById.setVisibility(8);
                            }
                        }
                        qVar.f46127g = b;
                        tVar = tVar2;
                    } else {
                        sVar = sVar2;
                        tVar = tVar3;
                    }
                    tVar.f45487e = b;
                }
                sVar.f45480c = b;
            }
        } else {
            dVar.f46369k.hide();
        }
        if (b.f43853d != null) {
            if (!dVar.f46370l) {
                C59104x b3 = C15458d.f46359a.mo56224b();
                b3.mo56378ag(C58975e.f156826a, "Morris.Service");
                ((C59052c) ((C59052c) b3).mo56372aa(45912)).mo56386p("#maybeToggleForegroundState foregrounding Morris service with persistent  notification");
                C14173n nVar3 = dVar.f46367i;
                if (!nVar3.f42936b.areNotificationsEnabled() || (notificationChannel = nVar3.f42936b.getNotificationChannel("morris2.new.drivingscreen.NOTIFICATION_CHANNEL")) == null || notificationChannel.getImportance() == 0) {
                    C14173n nVar4 = dVar.f46367i;
                    nVar4.f42936b.deleteNotificationChannel("com.google.android.apps.gsa.staticplugins.opa.morris2.drivingscreen.NOTIFICATION_CHANNEL");
                    nVar4.f42936b.deleteNotificationChannel("morris2.drivingscreen.NOTIFICATION_CHANNEL");
                    NotificationChannel notificationChannel2 = new NotificationChannel("morris2.new.drivingscreen.NOTIFICATION_CHANNEL", nVar4.f42935a.getString(R.string.channel_name), 4);
                    notificationChannel2.setDescription(nVar4.f42935a.getString(R.string.channel_description));
                    notificationChannel2.setSound(Uri.parse("android.resource://" + nVar4.f42935a.getPackageName() + "/2132017468"), (AudioAttributes) null);
                    notificationChannel2.enableVibration(true);
                    notificationChannel2.setVibrationPattern(new long[]{0});
                    nVar4.f42936b.createNotificationChannel(notificationChannel2);
                }
                Context context = dVar.f46360b;
                String string = context.getString(R.string.micro_content_title);
                String string2 = dVar.f46360b.getString(R.string.micro_content_text);
                Context context2 = dVar.f46360b;
                Intent intent = new Intent("com.google.android.apps.gsa.staticplugins.opa.morris.notification.INTENT_ACTION_NOTIFICATION_CLICKED");
                intent.setComponent(new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.staticplugins.opa.morris2.drivingscreen.DrivingScreenActivity"));
                PendingIntent broadcast = PendingIntent.getBroadcast(context2, 0, C147798a.m240896b(intent, 1140850688, 0), 1140850688);
                broadcast.getClass();
                C14637a aVar3 = new C14637a(C51474ja.PERSISTENT_NOTIFICATION_CLICK);
                Duration duration = Duration.ZERO;
                ComponentName componentName = new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.staticplugins.opa.morris2.drivingscreen.DrivingScreenActivity");
                Intent intent2 = new Intent("com.google.android.apps.gsa.staticplugins.opa.morris.notification.INTENT_ACTION_LAUNCH_DRIVING_SETTINGS");
                intent2.setComponent(componentName);
                new C1831r(0, context.getString(R.string.go_to_settings), PendingIntent.getBroadcast(context, 0, C147798a.m240896b(intent2, 1140850688, 0), 1140850688)).mo5008a();
                C1832s a7 = new C1831r(0, context.getResources().getString(R.string.not_driving), PendingIntent.getBroadcast(context, 0, new Intent("com.google.android.apps.gsa.staticplugins.opa.morris.shared.INTENT_ACTION_EXIT_CAR_MODE"), 67108864)).mo5008a();
                Intent intent3 = new Intent("com.google.android.apps.gsa.staticplugins.opa.morris.notification.INTENT_ACTION_NOTIFICATION_CLICKED");
                intent3.putExtra("INTENT_TRIGGERING_SOURCE_KEY", aVar3.f44236a.f134124v);
                PendingIntent broadcast2 = PendingIntent.getBroadcast(context, 0, intent3, 1140850688);
                C1839z zVar = new C1839z(context, "morris2.new.drivingscreen.NOTIFICATION_CHANNEL");
                zVar.f5679J.icon = R.drawable.opa_icon;
                Drawable drawable = context.getDrawable(R.drawable.driving_screen_app_icon);
                drawable.getClass();
                Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
                zVar.f5688h = createBitmap;
                zVar.f5685e = C1839z.m5037c(string);
                zVar.f5686f = C1839z.m5037c(string2);
                zVar.f5694n = C1839z.m5037c(context.getString(R.string.assistant));
                zVar.f5690j = 2;
                zVar.f5687g = broadcast2;
                zVar.mo5015d(16, true);
                zVar.mo5021j((Uri) null);
                zVar.f5679J.vibrate = null;
                zVar.mo5017f(a7);
                zVar.f5679J.deleteIntent = broadcast;
                dVar.f46361c.startForeground(C14639b.f44237a, zVar.mo5013a());
                int a8 = C14498ll.m30626a(dVar.f46371m.f43850a);
                if (a8 == 0) {
                    throw null;
                } else if (a8 == 5) {
                    ((C14986h) dVar.f46366h.mo17428b()).mo21873e();
                    dVar.f46363e.mo21423a(C37182a.f98030ex.mo40805c(C62722b.OK));
                } else {
                    dVar.f46363e.mo21423a(C37182a.f98152hM.mo40805c(C62722b.OK));
                }
            }
            z = true;
        } else {
            if (dVar.f46370l) {
                C59104x b4 = C15458d.f46359a.mo56224b();
                b4.mo56378ag(C58975e.f156826a, "Morris.Service");
                ((C59052c) ((C59052c) b4).mo56372aa(45911)).mo56386p("#maybeToggleForegroundState backgrounding Morris service");
                dVar.f46361c.stopForeground(true);
                int a9 = C14498ll.m30626a(b.f43850a);
                if (a9 == 0) {
                    throw null;
                } else if (a9 == 5) {
                    dVar.f46364f.mo21429c(dVar.f46365g.mo21608v());
                } else {
                    dVar.f46364f.mo21427a(C37182a.f98148hI.mo40805c(C62722b.OK));
                }
            }
            z = false;
        }
        dVar.f46370l = z;
        dVar.f46371m = b;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
