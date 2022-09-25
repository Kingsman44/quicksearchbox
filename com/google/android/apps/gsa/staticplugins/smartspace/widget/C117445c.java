package com.google.android.apps.gsa.staticplugins.smartspace.widget;

import android.content.Intent;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.smartspace.C92033ac;
import com.google.android.apps.gsa.smartspace.C92111g;
import com.google.android.apps.gsa.smartspace.C92113i;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3886c.C50792cp;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50802cz;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.p3888b.C50720e;
import com.google.assistant.p3886c.p3888b.C50722g;
import com.google.assistant.p3886c.p3888b.C50723h;
import com.google.assistant.p3886c.p3888b.C50729n;
import com.google.assistant.p3886c.p3888b.C50731p;
import com.google.assistant.p3886c.p3888b.C50733r;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62971cq;
import p3186j$.util.DesugarArrays;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.widget.c */
/* compiled from: PG */
public final class C117445c implements C92033ac {

    /* renamed from: a */
    public static final C58528ij f325982a = C58528ij.m90011K(C50794cr.HOLIDAY_ALARMS, C50794cr.AIR_QUALITY);

    /* renamed from: b */
    private static final C59071e f325983b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.smartspace.widget.c");

    /* renamed from: c */
    private final C86124t f325984c;

    /* renamed from: d */
    private final C117450h f325985d;

    public C117445c(C117450h hVar, C86124t tVar) {
        this.f325985d = hVar;
        this.f325984c = tVar;
    }

    /* renamed from: c */
    private static C92113i[] m195189c(C92113i[] iVarArr) {
        return (C92113i[]) DesugarArrays.stream((T[]) iVarArr).filter(C117443a.f325980a).toArray(C117444b.f325981a);
    }

    /* renamed from: a */
    public final C60870cx mo86686a(C92113i[] iVarArr, C58833ax axVar) {
        return mo86687b(m195189c(iVarArr));
    }

    /* renamed from: b */
    public final C60870cx mo86687b(C92113i[] iVarArr) {
        C50802cz czVar;
        String str;
        boolean e = this.f325984c.mo79746e(C90017bw.f247861C);
        String x = this.f325984c.mo79758x(C90017bw.f247862D);
        if (e && x != null && x.startsWith("1efd4ccd4f61g3ff3c2b3254b99abfx6_$_") && this.f325984c.mo79746e(C90017bw.f247864F)) {
            return C118826c.f331423b;
        }
        C92113i[] c = m195189c(iVarArr);
        for (C92113i iVar : c) {
            C59052c cVar = (C59052c) ((C59052c) f325983b.mo56224b()).mo56372aa(33126);
            C50794cr a = C50794cr.m85938a(iVar.f256820a.f132315l);
            if (a == null) {
                a = C50794cr.UNDEFINED;
            }
            cVar.mo56389s("received card type %s ", C92111g.m151146a(a));
        }
        C117450h hVar = this.f325985d;
        if (!hVar.f326002c.mo79746e(C89985ax.f246675aB)) {
            hVar.mo103307h();
            return C118826c.f331423b;
        } else if (c == null) {
            return C118826c.f331423b;
        } else {
            C92113i c2 = hVar.mo103303c(c, C50792cp.PRIMARY);
            C92113i c3 = hVar.mo103303c(c, C50792cp.SECONDARY);
            if (c2 != null) {
                C50818do doVar = c2.f256820a;
                if (!doVar.f132305b) {
                    long b = hVar.f326003d.mo26870b();
                    long j = doVar.f132318o;
                    long j2 = doVar.f132319p + j;
                    if (b < j) {
                        if ((doVar.f132304a & 64) != 0) {
                            czVar = doVar.f132311h;
                            if (czVar == null) {
                                czVar = C50802cz.f132236g;
                            }
                        } else {
                            czVar = doVar.f132308e;
                            if (czVar == null) {
                                czVar = C50802cz.f132236g;
                            }
                        }
                    } else if (b < j || b >= j2) {
                        if ((doVar.f132304a & 256) != 0) {
                            czVar = doVar.f132313j;
                            if (czVar == null) {
                                czVar = C50802cz.f132236g;
                            }
                        } else {
                            czVar = doVar.f132310g;
                            if (czVar == null) {
                                czVar = C50802cz.f132236g;
                            }
                        }
                    } else if ((doVar.f132304a & 128) != 0) {
                        czVar = doVar.f132312i;
                        if (czVar == null) {
                            czVar = C50802cz.f132236g;
                        }
                    } else {
                        czVar = doVar.f132309f;
                        if (czVar == null) {
                            czVar = C50802cz.f132236g;
                        }
                    }
                    if (czVar == null) {
                        C59104x d = C117450h.f326000a.mo56226d();
                        d.mo56378ag(C58975e.f156826a, "SSWidgetRndr");
                        ((C59052c) ((C59052c) d).mo56372aa(33133)).mo56386p("No valid message for event block");
                    }
                    if (czVar != null) {
                        RemoteViews remoteViews = new RemoteViews(hVar.f326001b.getPackageName(), R.layout.double_line);
                        remoteViews.setViewVisibility(R.id.title_trailing_truncatable, 0);
                        remoteViews.setViewVisibility(R.id.title_leading_truncatable, 0);
                        remoteViews.setViewVisibility(R.id.title_fixed_text, 0);
                        remoteViews.setViewVisibility(R.id.subtitle_weather_content, 8);
                        if ((czVar.f132238a & 1) != 0) {
                            C50723h hVar2 = czVar.f132239b;
                            if (hVar2 == null) {
                                hVar2 = C50723h.f131999e;
                            }
                            C62971cq cqVar = hVar2.f132004d;
                            int i = 0;
                            while (true) {
                                if (i >= cqVar.size()) {
                                    i = -1;
                                    break;
                                }
                                C50722g a2 = C50722g.m85893a(((C50720e) cqVar.get(i)).f131989c);
                                if (a2 == null) {
                                    a2 = C50722g.UNSPECIFIED;
                                }
                                if (a2 != C50722g.UNSPECIFIED) {
                                    break;
                                }
                                i++;
                            }
                            C50723h hVar3 = czVar.f132239b;
                            if (hVar3 == null) {
                                hVar3 = C50723h.f131999e;
                            }
                            if (hVar3.f132004d.size() != 2 || i < 0) {
                                remoteViews.setViewVisibility(R.id.title_fixed_text, 8);
                                remoteViews.setViewVisibility(R.id.title_trailing_truncatable, 8);
                                C50723h hVar4 = czVar.f132239b;
                                if (hVar4 == null) {
                                    hVar4 = C50723h.f131999e;
                                }
                                remoteViews.setTextViewText(R.id.title_leading_truncatable, C117450h.m195197g(hVar4));
                            } else {
                                C50723h hVar5 = czVar.f132239b;
                                if (hVar5 == null) {
                                    hVar5 = C50723h.f131999e;
                                }
                                int indexOf = hVar5.f132002b.indexOf("%1");
                                int indexOf2 = hVar5.f132002b.indexOf("%2");
                                if (i == 0) {
                                    if (indexOf < indexOf2) {
                                        remoteViews.setViewVisibility(R.id.title_trailing_truncatable, 8);
                                        int i2 = indexOf + 4;
                                        String replace = hVar5.f132002b.substring(0, i2).replace("%1$s", ((C50720e) hVar5.f132004d.get(0)).f131988b);
                                        String replace2 = hVar5.f132002b.substring(i2).replace("%2$s", ((C50720e) hVar5.f132004d.get(1)).f131988b);
                                        C58976aa aaVar = C58975e.f156826a;
                                        remoteViews.setTextViewText(R.id.title_leading_truncatable, replace);
                                        remoteViews.setTextViewText(R.id.title_fixed_text, replace2);
                                    } else {
                                        remoteViews.setViewVisibility(R.id.title_leading_truncatable, 8);
                                        int i3 = indexOf2 + 4;
                                        String replace3 = hVar5.f132002b.substring(0, i3).replace("%2$s", ((C50720e) hVar5.f132004d.get(1)).f131988b);
                                        String replace4 = hVar5.f132002b.substring(i3).replace("%1$s", ((C50720e) hVar5.f132004d.get(0)).f131988b);
                                        C58976aa aaVar2 = C58975e.f156826a;
                                        remoteViews.setTextViewText(R.id.title_trailing_truncatable, replace4);
                                        remoteViews.setTextViewText(R.id.title_fixed_text, replace3);
                                    }
                                } else if (i == 1) {
                                    if (indexOf < indexOf2) {
                                        remoteViews.setViewVisibility(R.id.title_leading_truncatable, 8);
                                        int i4 = indexOf + 4;
                                        String replace5 = hVar5.f132002b.substring(0, i4).replace("%1$s", ((C50720e) hVar5.f132004d.get(0)).f131988b);
                                        String replace6 = hVar5.f132002b.substring(i4).replace("%2$s", ((C50720e) hVar5.f132004d.get(1)).f131988b);
                                        C58976aa aaVar3 = C58975e.f156826a;
                                        remoteViews.setTextViewText(R.id.title_trailing_truncatable, replace6);
                                        remoteViews.setTextViewText(R.id.title_fixed_text, replace5);
                                    } else {
                                        remoteViews.setViewVisibility(R.id.title_trailing_truncatable, 8);
                                        int i5 = indexOf2 + 4;
                                        String replace7 = hVar5.f132002b.substring(0, i5).replace("%2$s", ((C50720e) hVar5.f132004d.get(1)).f131988b);
                                        String replace8 = hVar5.f132002b.substring(i5).replace("%1$s", ((C50720e) hVar5.f132004d.get(0)).f131988b);
                                        C58976aa aaVar4 = C58975e.f156826a;
                                        remoteViews.setTextViewText(R.id.title_leading_truncatable, replace7);
                                        remoteViews.setTextViewText(R.id.title_fixed_text, replace8);
                                    }
                                }
                            }
                        }
                        if ((czVar.f132238a & 4) != 0) {
                            C50723h hVar6 = czVar.f132241d;
                            if (hVar6 == null) {
                                hVar6 = C50723h.f131999e;
                            }
                            remoteViews.setTextViewText(R.id.subtitle_text, C117450h.m195197g(hVar6));
                        }
                        Bitmap bitmap = c2.f256821b;
                        if (bitmap != null) {
                            remoteViews.setImageViewBitmap(R.id.subtitle_icon, bitmap);
                            remoteViews.setViewVisibility(R.id.subtitle_icon, 0);
                            C50818do doVar2 = c2.f256820a;
                            if ((doVar2.f132304a & 512) != 0) {
                                C50729n nVar = doVar2.f132314k;
                                if (nVar == null) {
                                    nVar = C50729n.f132007g;
                                }
                                str = nVar.f132012d;
                            } else {
                                str = BuildConfig.FLAVOR;
                            }
                            C117450h.m195198j(remoteViews, R.id.subtitle_icon, str);
                        } else {
                            remoteViews.setViewVisibility(R.id.subtitle_icon, 8);
                        }
                        Intent b2 = C117450h.m195196b(c2.f256820a);
                        if (b2 != null) {
                            C50733r rVar = c2.f256820a.f132316m;
                            if (rVar == null) {
                                rVar = C50733r.f132021d;
                            }
                            C50731p a3 = C50731p.m85907a(rVar.f132024b);
                            if (a3 == null) {
                                a3 = C50731p.UNDEFINED;
                            }
                            remoteViews.setOnClickPendingIntent(R.id.smartspace_content, hVar.mo103302a(b2, 1, a3));
                        }
                        C58976aa aaVar5 = C58975e.f156826a;
                        C58833ax d2 = hVar.mo103304d();
                        if (d2.mo56113h()) {
                            hVar.f326004e.mo77192a(C118569b.SMARTSPACE_WIDGET_SIZE_DIP, (long) ((Integer) d2.mo56107c()).intValue());
                        }
                        return hVar.mo103306f(c3, remoteViews, R.id.subtitle_weather_content, R.id.subtitle_weather_icon, R.id.subtitle_weather_text, false);
                    }
                }
            }
            return hVar.mo103305e(c3);
        }
    }
}
