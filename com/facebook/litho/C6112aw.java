package com.facebook.litho;

import android.graphics.Rect;
import android.text.TextUtils;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.facebook.litho.p323b.C6118b;
import com.facebook.litho.p323b.C6119c;
import com.facebook.p313c.C6050i;
import com.facebook.p313c.C6051j;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.facebook.litho.aw */
/* compiled from: PG */
public final class C6112aw {

    /* renamed from: a */
    private static final HashSet f18043a = new HashSet(Arrays.asList(new String[]{"delegate", "feedPrefetcher", "parentFeedContextChain", "child", "children", "childComponent", "trackingCode", "eventsController", "itemAnimator", "onScrollListeners", "recyclerConfiguration", "threadTileViewData", "textColorStateList", "typeface", "text", "params"}));

    /* renamed from: a */
    private static String m15915a(Object obj, int i) {
        if (obj == null) {
            return BuildConfig.FLAVOR;
        }
        String replace = obj.toString().replace(" \n", " ").replace("\n", " ").replace("\"", BuildConfig.FLAVOR);
        return replace.length() > i ? String.valueOf(replace.substring(0, i)).concat("...") : replace;
    }

    public static void addViewDescription(C6110au auVar, StringBuilder sb, int i, int i2, boolean z, boolean z2) {
        addViewDescription(auVar, sb, i, i2, z, z2, (C6111av) null);
    }

    public static void addViewDescription(C6110au auVar, StringBuilder sb, int i, int i2, boolean z, boolean z2, C6111av avVar) {
        Object obj;
        C6248ev ay;
        sb.append("litho.");
        sb.append(auVar.mo12861b().mo13461q());
        sb.append('{');
        sb.append(Integer.toHexString(auVar.hashCode()));
        sb.append(' ');
        LithoView g = auVar.mo12863g();
        C6120ba f = auVar.mo12862f();
        String str = "V";
        String str2 = ".";
        sb.append((g == null || g.getVisibility() != 0) ? str2 : str);
        sb.append((f == null || (ay = f.f18060a.mo12952ay()) == null || ay.mo13095l() != 1) ? str2 : "F");
        sb.append((g == null || !g.isEnabled()) ? str2 : "E");
        sb.append(str2);
        sb.append((g == null || !g.isHorizontalScrollBarEnabled()) ? str2 : "H");
        if (g == null || !g.isVerticalScrollBarEnabled()) {
            str = str2;
        }
        sb.append(str);
        if (!(f == null || f.mo12873a() == null)) {
            str2 = "C";
        }
        sb.append(str2);
        sb.append(". .. ");
        Rect a = auVar.mo12860a();
        sb.append(a.left - i);
        sb.append(",");
        sb.append(a.top - i2);
        sb.append("-");
        sb.append(a.right - i);
        sb.append(",");
        sb.append(a.bottom - i2);
        String str3 = null;
        String aG = auVar.mo12868n() ? auVar.f18041b.mo12908aG() : null;
        if (aG != null && !TextUtils.isEmpty(aG)) {
            sb.append(" litho:id/");
            sb.append(aG.replace(' ', '_'));
        }
        LithoView g2 = auVar.mo12863g();
        if (g2 != null) {
            C6407q b = auVar.mo12861b();
            C6050i s = g2.mo12745s();
            int a2 = s.mo12627a();
            int i3 = 0;
            while (true) {
                if (i3 >= a2) {
                    break;
                }
                C6051j h = s.mo12629h(i3);
                C6407q qVar = h == null ? null : ((C6201du) h.f17806d.f17827b).f18345a.f18255e;
                if (qVar != null && qVar.f18989l == b.f18989l) {
                    Object obj2 = h.f17803a;
                    StringBuilder sb2 = new StringBuilder();
                    if (obj2 instanceof TextContent) {
                        for (CharSequence append : ((TextContent) obj2).getTextItems()) {
                            sb2.append(append);
                        }
                    } else if (obj2 instanceof TextView) {
                        sb2.append(((TextView) obj2).getText());
                    }
                    if (sb2.length() != 0) {
                        str3 = sb2.toString();
                        break;
                    }
                }
                i3++;
            }
        }
        if (str3 != null && !TextUtils.isEmpty(str3)) {
            sb.append(" text=\"");
            sb.append(m15915a(str3, 200));
            sb.append("\"");
        }
        if (z2) {
            C6407q b2 = auVar.mo12861b();
            JSONObject jSONObject = new JSONObject();
            for (Field field : b2.getClass().getDeclaredFields()) {
                try {
                    if (!f18043a.contains(field.getName())) {
                        C6118b bVar = (C6118b) field.getAnnotation(C6118b.class);
                        if (bVar != null) {
                            field.setAccessible(true);
                            C6119c cVar = C6119c.NONE;
                            int ordinal = bVar.mo12872a().ordinal();
                            if (ordinal == 1) {
                                String a3 = m15915a(field.get(b2), 50);
                                if (!TextUtils.isEmpty(a3)) {
                                    jSONObject.put(field.getName(), a3);
                                }
                            } else if (!(ordinal == 11 || ordinal == 6 || ordinal == 7 || ordinal == 8 || (obj = field.get(b2)) == null)) {
                                jSONObject.put(field.getName(), obj);
                            }
                        }
                    }
                } catch (Exception e) {
                    try {
                        jSONObject.put("DUMP-ERROR", m15915a(e.getMessage(), 50));
                    } catch (Exception unused) {
                    }
                }
            }
            if (jSONObject.length() > 0) {
                sb.append(" props=\"");
                sb.append(jSONObject.toString());
                sb.append("\"");
            }
        }
        if (avVar != null) {
            avVar.mo12869a();
        }
        if (!(z || f == null || f.mo12873a() == null)) {
            sb.append(" [clickable]");
        }
        sb.append('}');
    }
}
