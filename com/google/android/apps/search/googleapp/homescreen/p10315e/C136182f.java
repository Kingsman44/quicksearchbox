package com.google.android.apps.search.googleapp.homescreen.p10315e;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.homescreen.p10315e.p10317b.C136174o;
import com.google.android.apps.search.googleapp.p10165d.C133933a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4580v.C60950i;
import java.util.List;
import p3186j$.time.ZoneId;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.homescreen.e.f */
/* compiled from: PG */
public final class C136182f implements C46792di {

    /* renamed from: a */
    final /* synthetic */ C136183g f370864a;

    /* renamed from: b */
    final /* synthetic */ ViewGroup f370865b;

    public C136182f(C136183g gVar, ViewGroup viewGroup) {
        this.f370864a = gVar;
        this.f370865b = viewGroup;
    }

    /* renamed from: a */
    public final void mo18077a(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        C59052c cVar = (C59052c) ((C59052c) C136183g.f370866a.mo56225c()).mo56382g(th);
        cVar.mo56379ah(new C59094n(40703));
        cVar.mo56386p("Failed to load weather widget.");
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
        C136159b bVar;
        String str;
        C136174o oVar = (C136174o) obj;
        C69664n.m101061g(oVar, "weatherWidgetData");
        C136183g gVar = this.f370864a;
        ViewGroup viewGroup = this.f370865b;
        ((TextView) viewGroup.findViewById(R.id.googleapp_temp)).setText(oVar.f370853a);
        List list = oVar.f370854b;
        if (!list.isEmpty()) {
            ImageView imageView = (ImageView) viewGroup.findViewById(R.id.googleapp_condition_icon);
            List list2 = C136159b.f370820a;
            Context context = gVar.f370867b;
            C60950i iVar = gVar.f370870e;
            C69664n.m101061g(context, "context");
            C69664n.m101061g(list, "condition");
            C69664n.m101061g(iVar, "timeSource");
            int hour = iVar.mo57446c(ZoneId.systemDefault()).getHour();
            boolean z = true;
            if (hour <= 18 && hour >= 5) {
                z = false;
            }
            if (C133933a.m217248a(context)) {
                if (list.containsAll(C136159b.f370820a) && z) {
                    bVar = new C136159b(R.drawable.product_logo_partly_cloudy_night_dark_color_32, Integer.valueOf(R.string.googleapp_weather_icon_partly_cloudy_content_description));
                } else if (list.containsAll(C136159b.f370820a) && !z) {
                    bVar = new C136159b(R.drawable.product_logo_partly_cloudy_dark_color_32, Integer.valueOf(R.string.googleapp_weather_icon_partly_cloudy_content_description));
                } else if (list.containsAll(C136159b.f370821b) && z) {
                    bVar = new C136159b(R.drawable.product_logo_scattered_showers_night_dark_color_32, Integer.valueOf(R.string.googleapp_weather_icon_light_rain_content_description));
                } else if (!list.containsAll(C136159b.f370821b) || z) {
                    if (!list.containsAll(C136159b.f370822c)) {
                        if (!list.containsAll(C136159b.f370823d)) {
                            switch (((Number) list.get(0)).intValue()) {
                                case 0:
                                    bVar = new C136159b(R.drawable.product_logo_not_available_dark_color_32, (Integer) null);
                                    break;
                                case 1:
                                    if (!z) {
                                        bVar = new C136159b(R.drawable.product_logo_sunny_dark_color_32, Integer.valueOf(R.string.googleapp_weather_icon_clear_content_description));
                                        break;
                                    } else {
                                        bVar = new C136159b(R.drawable.product_logo_clear_night_dark_color_32, Integer.valueOf(R.string.googleapp_weather_icon_clear_content_description));
                                        break;
                                    }
                                case 2:
                                    if (!z) {
                                        bVar = new C136159b(R.drawable.product_logo_mostly_cloudy_day_dark_color_32, Integer.valueOf(R.string.googleapp_weather_icon_cloudy_content_description));
                                        break;
                                    } else {
                                        bVar = new C136159b(R.drawable.product_logo_mostly_cloudy_night_dark_color_32, Integer.valueOf(R.string.googleapp_weather_icon_cloudy_content_description));
                                        break;
                                    }
                                case 3:
                                case 4:
                                    bVar = new C136159b(R.drawable.product_logo_haze_fog_dust_smoke_dark_color_32, Integer.valueOf(R.string.googleapp_weather_icon_hazy_content_description));
                                    break;
                                case 5:
                                    bVar = new C136159b(R.drawable.product_logo_wintry_mix_rain_snow_dark_color_32, Integer.valueOf(R.string.googleapp_weather_icon_icy_content_description));
                                    break;
                                case 6:
                                    bVar = new C136159b(R.drawable.product_logo_showers_rain_dark_color_32, Integer.valueOf(R.string.googleapp_weather_icon_rainy_content_description));
                                    break;
                                case 7:
                                    bVar = new C136159b(R.drawable.product_logo_snow_showers_snow_dark_color_32, Integer.valueOf(R.string.googleapp_weather_icon_snowy_content_description));
                                    break;
                                case 8:
                                    bVar = new C136159b(R.drawable.product_logo_strong_tstorms_dark_color_32, Integer.valueOf(R.string.googleapp_weather_icon_stormy_content_description));
                                    break;
                                case 9:
                                    bVar = new C136159b(R.drawable.product_logo_windy_breezy_dark_color_32, Integer.valueOf(R.string.googleapp_weather_icon_windy_content_description));
                                    break;
                                default:
                                    bVar = new C136159b(R.drawable.product_logo_not_available_dark_color_32, (Integer) null);
                                    break;
                            }
                        } else {
                            bVar = new C136159b(R.drawable.product_logo_heavy_snow_dark_color_32, Integer.valueOf(R.string.googleapp_weather_icon_snow_storm_content_description));
                        }
                    } else {
                        bVar = new C136159b(R.drawable.product_logo_strong_tstorms_dark_color_32, Integer.valueOf(R.string.googleapp_weather_icon_rain_storm_content_description));
                    }
                } else {
                    bVar = new C136159b(R.drawable.product_logo_scattered_showers_day_dark_color_32, Integer.valueOf(R.string.googleapp_weather_icon_light_rain_content_description));
                }
            } else if (list.containsAll(C136159b.f370820a) && z) {
                bVar = new C136159b(R.drawable.product_logo_partly_cloudy_night_light_color_32, Integer.valueOf(R.string.googleapp_weather_icon_partly_cloudy_content_description));
            } else if (list.containsAll(C136159b.f370820a) && !z) {
                bVar = new C136159b(R.drawable.product_logo_partly_cloudy_light_color_32, Integer.valueOf(R.string.googleapp_weather_icon_partly_cloudy_content_description));
            } else if (list.containsAll(C136159b.f370821b) && z) {
                bVar = new C136159b(R.drawable.product_logo_scattered_showers_night_light_color_32, Integer.valueOf(R.string.googleapp_weather_icon_light_rain_content_description));
            } else if (!list.containsAll(C136159b.f370821b) || z) {
                if (!list.containsAll(C136159b.f370822c)) {
                    if (!list.containsAll(C136159b.f370823d)) {
                        switch (((Number) list.get(0)).intValue()) {
                            case 0:
                                bVar = new C136159b(R.drawable.product_logo_not_available_light_color_32, (Integer) null);
                                break;
                            case 1:
                                if (!z) {
                                    bVar = new C136159b(R.drawable.product_logo_sunny_light_color_32, Integer.valueOf(R.string.googleapp_weather_icon_clear_content_description));
                                    break;
                                } else {
                                    bVar = new C136159b(R.drawable.product_logo_clear_night_light_color_32, Integer.valueOf(R.string.googleapp_weather_icon_clear_content_description));
                                    break;
                                }
                            case 2:
                                if (!z) {
                                    bVar = new C136159b(R.drawable.product_logo_mostly_cloudy_day_light_color_32, Integer.valueOf(R.string.googleapp_weather_icon_cloudy_content_description));
                                    break;
                                } else {
                                    bVar = new C136159b(R.drawable.product_logo_mostly_cloudy_night_light_color_32, Integer.valueOf(R.string.googleapp_weather_icon_cloudy_content_description));
                                    break;
                                }
                            case 3:
                            case 4:
                                bVar = new C136159b(R.drawable.product_logo_haze_fog_dust_smoke_light_color_32, Integer.valueOf(R.string.googleapp_weather_icon_hazy_content_description));
                                break;
                            case 5:
                                bVar = new C136159b(R.drawable.product_logo_wintry_mix_rain_snow_light_color_32, Integer.valueOf(R.string.googleapp_weather_icon_icy_content_description));
                                break;
                            case 6:
                                bVar = new C136159b(R.drawable.product_logo_showers_rain_light_color_32, Integer.valueOf(R.string.googleapp_weather_icon_rainy_content_description));
                                break;
                            case 7:
                                bVar = new C136159b(R.drawable.product_logo_snow_showers_snow_light_color_32, Integer.valueOf(R.string.googleapp_weather_icon_snowy_content_description));
                                break;
                            case 8:
                                bVar = new C136159b(R.drawable.product_logo_strong_tstorms_light_color_32, Integer.valueOf(R.string.googleapp_weather_icon_stormy_content_description));
                                break;
                            case 9:
                                bVar = new C136159b(R.drawable.product_logo_windy_breezy_light_color_32, Integer.valueOf(R.string.googleapp_weather_icon_windy_content_description));
                                break;
                            default:
                                bVar = new C136159b(R.drawable.product_logo_not_available_light_color_32, (Integer) null);
                                break;
                        }
                    } else {
                        bVar = new C136159b(R.drawable.product_logo_heavy_snow_light_color_32, Integer.valueOf(R.string.googleapp_weather_icon_snow_storm_content_description));
                    }
                } else {
                    bVar = new C136159b(R.drawable.product_logo_strong_tstorms_light_color_32, Integer.valueOf(R.string.googleapp_weather_icon_rain_storm_content_description));
                }
            } else {
                bVar = new C136159b(R.drawable.product_logo_scattered_showers_day_light_color_32, Integer.valueOf(R.string.googleapp_weather_icon_light_rain_content_description));
            }
            imageView.setImageResource(bVar.f370824e);
            Context context2 = gVar.f370867b;
            C69664n.m101061g(context2, "context");
            Integer num = bVar.f370825f;
            if (num == null) {
                str = BuildConfig.FLAVOR;
            } else {
                str = context2.getString(num.intValue());
                C69664n.m101060f(str, "{\n      context.getStrin…criptionResourceId)\n    }");
            }
            imageView.setContentDescription(str);
        }
        viewGroup.setVisibility(0);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo18079c() {
    }
}
